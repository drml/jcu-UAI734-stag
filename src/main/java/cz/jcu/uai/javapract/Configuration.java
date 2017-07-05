package cz.jcu.uai.javapract;

import org.ini4j.Wini;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * configuration access class.
 * Uses configuration specified in a given INI file.
 * If the file is not found, will try to recreate file with defaults and throws and exception.
 *
 * Created by Drml on 4.7.2017.
 */
public class Configuration {

    private static final String INI_SECTION = "StagWatchdog";
    private String configFilename;
    private ConfigurationParameters props;



    private Wini ini;

    /**
     * Create configuration and load it from file.
     *
     * @param configFilename Config INI file location
     */
    public Configuration(String configFilename) throws NotConfiguredException
    {
        this.configFilename = configFilename;
        load();
    }


    /**
     * Loads the configuration from file.
     * If no config is present, tries to recreate defaults.
     *
     * @throws NotConfiguredException if configuration was not found or inceomplete.
     */
    private void load() throws NotConfiguredException
    {
        try {
            ini = new Wini(new File(configFilename));
            ini.load();
        } catch (IOException e) {
            this.restoreDefaults();
        }

        props = new ConfigurationParameters(
                get("apiUrl"),
                get("studentId"),
                get("semester"),
                Integer.parseInt(get("refreshRate"))
        );
    }

    /**
     * Restore default settings and save them to file.
     *
     * @throws NotConfiguredException if the file is unwritable
     */
    private void restoreDefaults() throws NotConfiguredException
    {
        File newFile = new File(configFilename);
        try {
            newFile.createNewFile();
            ini = new Wini(new File(configFilename));
        } catch (IOException e) {
            e.printStackTrace();
            throw new NotConfiguredException("Nepodarilo se vytvorit INI soubor, zkontrolujte cestu");
        }

        // Example: https://stag-ws.jcu.cz/ws/services/rest/rozvrhy/getRozvrhByStudent?outputFormatEncoding=UTF-8&outputFormat=json&osCislo=B15254&semestr=ZS
        ini.add(INI_SECTION, "apiUrl", "https://stag-ws.jcu.cz/ws/services/rest/rozvrhy/getRozvrhByStudent?outputFormatEncoding=UTF-8&outputFormat=json");
        ini.add(INI_SECTION, "studentId", "B15254");

        SimpleDateFormat formater = new SimpleDateFormat("M");
        int currentMonth = Integer.parseInt(formater.format(new Date()));

        if (currentMonth > 6 ){
            ini.add(INI_SECTION, "semester", "ZS");
        } else {
            ini.add(INI_SECTION, "semester", "LS");
        }

        ini.add(INI_SECTION, "refreshRate", "60");

        try {
            ini.store();
        } catch (IOException e) {
            throw new NotConfiguredException("Cannot recreate default config in path '"+ configFilename +"'.");
        }
    }


    /**
     * Get configuration parameter helper - chech for NULL and restor defaults if configuration corrupted
     *
     * @param key Configuration parameter name
     * @return Configured value
     * @throws NotConfiguredException if parameter is not found
     */
    private String get(String key) throws NotConfiguredException
    {
        if (ini != null){
            String value = ini.get(INI_SECTION,key);
            if (value != null){
                return value;
            }
        }

        this.restoreDefaults();
        throw new NotConfiguredException("Config key '"+key+"' missing. Defaults restored.");
    }

    public ConfigurationParameters getProps()
    {
        return props;
    }


}
