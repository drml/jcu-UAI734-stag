package cz.jcu.uai.javapract;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Drml on 4.7.2017.
 */
public class StagMock implements StagInterface {

    public StagMock()
    {
    }

//    public StagMock(ConfigurationParameters configurationParameters, Parser parser)
//    {
//        super(configurationParameters, parser);
//    }

    public String fetchCurrentTimetableJson()
    {
        return "[{\"rozvrhovaAkce\":[{\"roakIdno\":276705,\"nazev\":\"Teoretická informatika\",\"katedra\":\"UAI\",\"predmet\":\"732\",\"statut\":\"A\",\"ucitIdno\":null,\"ucitel\":null,\"rok\":\"2016\",\"budova\":\"BB\",\"mistnost\":\"1\",\"kapacitaMistnosti\":50,\"planObsazeni\":50,\"obsazeni\":29,\"typAkce\":\"Přednáška\",\"typAkceZkr\":\"Př\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Pondělí\",\"denZkr\":\"Po\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"08:00\"},\"hodinaSkutDo\":{\"value\":\"09:30\"},\"tydenOd\":40,\"tydenDo\":1,\"tyden\":\"Každý\",\"tydenZkr\":\"K\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"3.10.2016\"},\"datumDo\":{\"value\":\"2.1.2017\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"\",\"vsichniUciteleJmenaTituly\":\"\",\"vsichniUcitelePrijmeni\":\"\",\"referencedIdno\":276705,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276461,\"nazev\":\"Bakalářská angličtina NS 3\",\"katedra\":\"OJZ\",\"predmet\":\"230\",\"statut\":\"C\",\"ucitIdno\":26606,\"ucitel\":{\"ucitIdno\":26606,\"jmeno\":\"Natalie\",\"prijmeni\":\"Czaban\",\"titulZa\":\"M.A.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"BB\",\"mistnost\":\"4\",\"kapacitaMistnosti\":15,\"planObsazeni\":12,\"obsazeni\":10,\"typAkce\":\"Cvičení\",\"typAkceZkr\":\"Cv\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Pondělí\",\"denZkr\":\"Po\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"12:00\"},\"hodinaSkutDo\":{\"value\":\"13:30\"},\"tydenOd\":40,\"tydenDo\":1,\"tyden\":\"Každý\",\"tydenZkr\":\"K\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"3.10.2016\"},\"datumDo\":{\"value\":\"2.1.2017\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"26606\",\"vsichniUciteleJmenaTituly\":\"Natalie Czaban, M.A.\",\"vsichniUcitelePrijmeni\":\"Czaban\",\"referencedIdno\":276461,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276706,\"nazev\":\"Teoretická informatika\",\"katedra\":\"UAI\",\"predmet\":\"732\",\"statut\":\"A\",\"ucitIdno\":8381,\"ucitel\":{\"ucitIdno\":8381,\"jmeno\":\"Miroslav\",\"prijmeni\":\"Skrbek\",\"titulPred\":\"Ing.\",\"titulZa\":\"Ph.D.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"AV\",\"mistnost\":\"Pč4\",\"kapacitaMistnosti\":27,\"planObsazeni\":25,\"obsazeni\":15,\"typAkce\":\"Cvičení\",\"typAkceZkr\":\"Cv\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Pondělí\",\"denZkr\":\"Po\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"14:30\"},\"hodinaSkutDo\":{\"value\":\"16:00\"},\"tydenOd\":40,\"tydenDo\":1,\"tyden\":\"Každý\",\"tydenZkr\":\"K\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"3.10.2016\"},\"datumDo\":{\"value\":\"2.1.2017\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"8381\",\"vsichniUciteleJmenaTituly\":\"Ing. Miroslav Skrbek, Ph.D.\",\"vsichniUcitelePrijmeni\":\"Skrbek\",\"referencedIdno\":276706,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276729,\"nazev\":\"Operační systémy II\",\"katedra\":\"UAI\",\"predmet\":\"755\",\"statut\":\"A\",\"ucitIdno\":4009,\"ucitel\":{\"ucitIdno\":4009,\"jmeno\":\"Jiří\",\"prijmeni\":\"Pech\",\"titulPred\":\"Mgr.\",\"titulZa\":\"Ph.D.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"BB\",\"mistnost\":\"1\",\"kapacitaMistnosti\":50,\"planObsazeni\":50,\"obsazeni\":33,\"typAkce\":\"Přednáška\",\"typAkceZkr\":\"Př\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Úterý\",\"denZkr\":\"Út\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"08:00\"},\"hodinaSkutDo\":{\"value\":\"09:30\"},\"tydenOd\":40,\"tydenDo\":1,\"tyden\":\"Každý\",\"tydenZkr\":\"K\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"4.10.2016\"},\"datumDo\":{\"value\":\"3.1.2017\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"4009\",\"vsichniUciteleJmenaTituly\":\"Mgr. Jiří Pech, Ph.D.\",\"vsichniUcitelePrijmeni\":\"Pech\",\"referencedIdno\":276729,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276668,\"nazev\":\"Počítačové sítě I\",\"katedra\":\"UAI\",\"predmet\":\"699\",\"statut\":\"A\",\"ucitIdno\":7852,\"ucitel\":{\"ucitIdno\":7852,\"jmeno\":\"Rudolf\",\"prijmeni\":\"Vohnout\",\"titulPred\":\"Ing.\",\"titulZa\":\"Ph.D.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"BB\",\"mistnost\":\"1\",\"kapacitaMistnosti\":50,\"planObsazeni\":50,\"obsazeni\":38,\"typAkce\":\"Přednáška\",\"typAkceZkr\":\"Př\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Úterý\",\"denZkr\":\"Út\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"09:45\"},\"hodinaSkutDo\":{\"value\":\"11:15\"},\"tydenOd\":40,\"tydenDo\":1,\"tyden\":\"Každý\",\"tydenZkr\":\"K\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"4.10.2016\"},\"datumDo\":{\"value\":\"3.1.2017\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"7852, 7766\",\"vsichniUciteleJmenaTituly\":\"Ing. Rudolf Vohnout, Ph.D., Ing. Bc. Břetislav Bakala\",\"vsichniUcitelePrijmeni\":\"Vohnout, Bakala\",\"referencedIdno\":276668,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276670,\"nazev\":\"Počítačové sítě I\",\"katedra\":\"UAI\",\"predmet\":\"699\",\"statut\":\"A\",\"ucitIdno\":7766,\"ucitel\":{\"ucitIdno\":7766,\"jmeno\":\"Břetislav\",\"prijmeni\":\"Bakala\",\"titulPred\":\"Ing. Bc.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"AV\",\"mistnost\":\"Pč4\",\"kapacitaMistnosti\":27,\"planObsazeni\":16,\"obsazeni\":14,\"typAkce\":\"Cvičení\",\"typAkceZkr\":\"Cv\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Úterý\",\"denZkr\":\"Út\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"14:00\"},\"hodinaSkutDo\":{\"value\":\"15:30\"},\"tydenOd\":40,\"tydenDo\":1,\"tyden\":\"Sudý\",\"tydenZkr\":\"S\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"4.10.2016\"},\"datumDo\":{\"value\":\"13.12.2016\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"7766\",\"vsichniUciteleJmenaTituly\":\"Ing. Bc. Břetislav Bakala\",\"vsichniUcitelePrijmeni\":\"Bakala\",\"referencedIdno\":276670,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276626,\"nazev\":\"Architektura počítačů II\",\"katedra\":\"UAI\",\"predmet\":\"682\",\"statut\":\"A\",\"ucitIdno\":7766,\"ucitel\":{\"ucitIdno\":7766,\"jmeno\":\"Břetislav\",\"prijmeni\":\"Bakala\",\"titulPred\":\"Ing. Bc.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"BC\",\"mistnost\":\"C1\",\"kapacitaMistnosti\":60,\"planObsazeni\":30,\"obsazeni\":9,\"typAkce\":\"Přednáška\",\"typAkceZkr\":\"Př\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Úterý\",\"denZkr\":\"Út\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"17:45\"},\"hodinaSkutDo\":{\"value\":\"19:15\"},\"tydenOd\":40,\"tydenDo\":1,\"tyden\":\"Každý\",\"tydenZkr\":\"K\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"4.10.2016\"},\"datumDo\":{\"value\":\"3.1.2017\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"7766\",\"vsichniUciteleJmenaTituly\":\"Ing. Bc. Břetislav Bakala\",\"vsichniUcitelePrijmeni\":\"Bakala\",\"referencedIdno\":276626,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276730,\"nazev\":\"Operační systémy II\",\"katedra\":\"UAI\",\"predmet\":\"755\",\"statut\":\"A\",\"ucitIdno\":4009,\"ucitel\":{\"ucitIdno\":4009,\"jmeno\":\"Jiří\",\"prijmeni\":\"Pech\",\"titulPred\":\"Mgr.\",\"titulZa\":\"Ph.D.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"AV\",\"mistnost\":\"Pč4\",\"kapacitaMistnosti\":27,\"planObsazeni\":27,\"obsazeni\":21,\"typAkce\":\"Cvičení\",\"typAkceZkr\":\"Cv\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Úterý\",\"denZkr\":\"Út\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"11:30\"},\"hodinaSkutDo\":{\"value\":\"13:00\"},\"tydenOd\":40,\"tydenDo\":1,\"tyden\":\"Lichý\",\"tydenZkr\":\"L\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"11.10.2016\"},\"datumDo\":{\"value\":\"3.1.2017\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"4009\",\"vsichniUciteleJmenaTituly\":\"Mgr. Jiří Pech, Ph.D.\",\"vsichniUcitelePrijmeni\":\"Pech\",\"referencedIdno\":276730,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":289328,\"nazev\":\"Architektura počítačů II\",\"katedra\":\"UAI\",\"predmet\":\"682\",\"statut\":\"A\",\"ucitIdno\":7766,\"ucitel\":{\"ucitIdno\":7766,\"jmeno\":\"Břetislav\",\"prijmeni\":\"Bakala\",\"titulPred\":\"Ing. Bc.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"AV\",\"mistnost\":\"Pč4\",\"kapacitaMistnosti\":27,\"planObsazeni\":27,\"obsazeni\":9,\"typAkce\":\"Cvičení\",\"typAkceZkr\":\"Cv\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Úterý\",\"denZkr\":\"Út\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"16:00\"},\"hodinaSkutDo\":{\"value\":\"17:30\"},\"tydenOd\":40,\"tydenDo\":1,\"tyden\":\"Lichý\",\"tydenZkr\":\"L\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"11.10.2016\"},\"datumDo\":{\"value\":\"3.1.2017\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"7766\",\"vsichniUciteleJmenaTituly\":\"Ing. Bc. Břetislav Bakala\",\"vsichniUcitelePrijmeni\":\"Bakala\",\"referencedIdno\":289328,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276632,\"nazev\":\"Pokročilé databázové systémy\",\"katedra\":\"UAI\",\"predmet\":\"683\",\"statut\":\"A\",\"ucitIdno\":5046,\"ucitel\":{\"ucitIdno\":5046,\"jmeno\":\"Miloš\",\"prijmeni\":\"Prokýšek\",\"titulPred\":\"Mgr.\",\"titulZa\":\"Ph.D.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"AV\",\"mistnost\":\"Pč4\",\"kapacitaMistnosti\":27,\"planObsazeni\":28,\"obsazeni\":25,\"typAkce\":\"Přednáška\",\"typAkceZkr\":\"Př\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Středa\",\"denZkr\":\"St\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"11:30\"},\"hodinaSkutDo\":{\"value\":\"13:00\"},\"tydenOd\":40,\"tydenDo\":1,\"tyden\":\"Každý\",\"tydenZkr\":\"K\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"5.10.2016\"},\"datumDo\":{\"value\":\"4.1.2017\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"5046\",\"vsichniUciteleJmenaTituly\":\"Mgr. Miloš Prokýšek, Ph.D.\",\"vsichniUcitelePrijmeni\":\"Prokýšek\",\"referencedIdno\":276632,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276633,\"nazev\":\"Pokročilé databázové systémy\",\"katedra\":\"UAI\",\"predmet\":\"683\",\"statut\":\"A\",\"ucitIdno\":5046,\"ucitel\":{\"ucitIdno\":5046,\"jmeno\":\"Miloš\",\"prijmeni\":\"Prokýšek\",\"titulPred\":\"Mgr.\",\"titulZa\":\"Ph.D.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"AV\",\"mistnost\":\"Pč4\",\"kapacitaMistnosti\":27,\"planObsazeni\":28,\"obsazeni\":25,\"typAkce\":\"Cvičení\",\"typAkceZkr\":\"Cv\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Středa\",\"denZkr\":\"St\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"13:00\"},\"hodinaSkutDo\":{\"value\":\"14:30\"},\"tydenOd\":40,\"tydenDo\":1,\"tyden\":\"Každý\",\"tydenZkr\":\"K\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"5.10.2016\"},\"datumDo\":{\"value\":\"4.1.2017\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"5046\",\"vsichniUciteleJmenaTituly\":\"Mgr. Miloš Prokýšek, Ph.D.\",\"vsichniUcitelePrijmeni\":\"Prokýšek\",\"referencedIdno\":276633,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276710,\"nazev\":\"Programování v C++ I\",\"katedra\":\"UAI\",\"predmet\":\"735\",\"statut\":\"B\",\"ucitIdno\":24299,\"ucitel\":{\"ucitIdno\":24299,\"jmeno\":\"Jan\",\"prijmeni\":\"Fesl\",\"titulPred\":\"Ing.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"BC\",\"mistnost\":\"C2\",\"kapacitaMistnosti\":154,\"planObsazeni\":154,\"obsazeni\":20,\"typAkce\":\"Přednáška\",\"typAkceZkr\":\"Př\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Středa\",\"denZkr\":\"St\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"15:00\"},\"hodinaSkutDo\":{\"value\":\"16:30\"},\"tydenOd\":40,\"tydenDo\":1,\"tyden\":\"Každý\",\"tydenZkr\":\"K\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"5.10.2016\"},\"datumDo\":{\"value\":\"4.1.2017\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"24299\",\"vsichniUciteleJmenaTituly\":\"Ing. Jan Fesl\",\"vsichniUcitelePrijmeni\":\"Fesl\",\"referencedIdno\":276710,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276732,\"nazev\":\"CISCO Academy I\",\"katedra\":\"UAI\",\"predmet\":\"756\",\"statut\":\"C\",\"ucitIdno\":23972,\"ucitel\":{\"ucitIdno\":23972,\"jmeno\":\"Lukáš\",\"prijmeni\":\"Valenta\",\"titulPred\":\"Bc.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"AV\",\"mistnost\":\"207\",\"kapacitaMistnosti\":10,\"planObsazeni\":25,\"obsazeni\":7,\"typAkce\":\"Přednáška\",\"typAkceZkr\":\"Př\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Středa\",\"denZkr\":\"St\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"16:00\"},\"hodinaSkutDo\":{\"value\":\"16:45\"},\"tydenOd\":41,\"tydenDo\":1,\"tyden\":\"Jiný\",\"tydenZkr\":\"J\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":\"Automaticky vygenerovaná apost. akce\",\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"12.10.2016\"},\"datumDo\":{\"value\":\"4.1.2017\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"23972\",\"vsichniUciteleJmenaTituly\":\"Bc. Lukáš Valenta\",\"vsichniUcitelePrijmeni\":\"Valenta\",\"referencedIdno\":276732,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276733,\"nazev\":\"CISCO Academy I\",\"katedra\":\"UAI\",\"predmet\":\"756\",\"statut\":\"C\",\"ucitIdno\":null,\"ucitel\":null,\"rok\":\"2016\",\"budova\":\"AV\",\"mistnost\":\"207\",\"kapacitaMistnosti\":10,\"planObsazeni\":25,\"obsazeni\":7,\"typAkce\":\"Cvičení\",\"typAkceZkr\":\"Cv\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Středa\",\"denZkr\":\"St\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"16:45\"},\"hodinaSkutDo\":{\"value\":\"19:00\"},\"tydenOd\":41,\"tydenDo\":1,\"tyden\":\"Jiný\",\"tydenZkr\":\"J\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"12.10.2016\"},\"datumDo\":{\"value\":\"4.1.2017\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"\",\"vsichniUciteleJmenaTituly\":\"\",\"vsichniUcitelePrijmeni\":\"\",\"referencedIdno\":276733,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276712,\"nazev\":\"Programování v C++ I\",\"katedra\":\"UAI\",\"predmet\":\"735\",\"statut\":\"B\",\"ucitIdno\":28738,\"ucitel\":{\"ucitIdno\":28738,\"jmeno\":\"Jan\",\"prijmeni\":\"Turoň\",\"titulPred\":\"Mgr.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"AV\",\"mistnost\":\"Pč4\",\"kapacitaMistnosti\":27,\"planObsazeni\":27,\"obsazeni\":19,\"typAkce\":\"Cvičení\",\"typAkceZkr\":\"Cv\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Čtvrtek\",\"denZkr\":\"Čt\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"16:30\"},\"hodinaSkutDo\":{\"value\":\"18:00\"},\"tydenOd\":40,\"tydenDo\":1,\"tyden\":\"Každý\",\"tydenZkr\":\"K\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":{\"value\":\"6.10.2016\"},\"datumDo\":{\"value\":\"5.1.2017\"},\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"28738\",\"vsichniUciteleJmenaTituly\":\"Mgr. Jan Turoň\",\"vsichniUcitelePrijmeni\":\"Turoň\",\"referencedIdno\":276712,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276674,\"nazev\":\"Administrace Windows Serveru - týdenní p\",\"katedra\":\"UAI\",\"predmet\":\"701\",\"statut\":\"A\",\"ucitIdno\":null,\"ucitel\":null,\"rok\":\"2016\",\"budova\":null,\"mistnost\":null,\"kapacitaMistnosti\":null,\"planObsazeni\":777,\"obsazeni\":23,\"typAkce\":\"Seminář\",\"typAkceZkr\":\"Se\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":null,\"denZkr\":null,\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"00:00\"},\"hodinaSkutDo\":{\"value\":\"00:00\"},\"tydenOd\":0,\"tydenDo\":0,\"tyden\":\"Jiný\",\"tydenZkr\":\"J\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":null,\"datumDo\":null,\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"\",\"vsichniUciteleJmenaTituly\":\"\",\"vsichniUcitelePrijmeni\":\"\",\"referencedIdno\":276674,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276685,\"nazev\":\"Týdenní praktikum programování v C#\",\"katedra\":\"UAI\",\"predmet\":\"709\",\"statut\":\"A\",\"ucitIdno\":null,\"ucitel\":null,\"rok\":\"2016\",\"budova\":null,\"mistnost\":null,\"kapacitaMistnosti\":null,\"planObsazeni\":777,\"obsazeni\":29,\"typAkce\":\"Seminář\",\"typAkceZkr\":\"Se\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":null,\"denZkr\":null,\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"00:00\"},\"hodinaSkutDo\":{\"value\":\"00:00\"},\"tydenOd\":0,\"tydenDo\":0,\"tyden\":\"Jiný\",\"tydenZkr\":\"J\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":\"Automaticky vygenerovaná apost. akce\",\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":null,\"datumDo\":null,\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"\",\"vsichniUciteleJmenaTituly\":\"\",\"vsichniUcitelePrijmeni\":\"\",\"referencedIdno\":276685,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":276695,\"nazev\":\"Prostředky osobní identifikace, biomet.\",\"katedra\":\"UAI\",\"predmet\":\"719\",\"statut\":\"A\",\"ucitIdno\":null,\"ucitel\":null,\"rok\":\"2016\",\"budova\":null,\"mistnost\":null,\"kapacitaMistnosti\":null,\"planObsazeni\":777,\"obsazeni\":34,\"typAkce\":\"Přednáška\",\"typAkceZkr\":\"Př\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":null,\"denZkr\":null,\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"00:00\"},\"hodinaSkutDo\":{\"value\":\"00:00\"},\"tydenOd\":0,\"tydenDo\":0,\"tyden\":\"Jiný\",\"tydenZkr\":\"J\",\"grupIdno\":null,\"jeNadrazena\":\"N\",\"maNadrazenou\":\"N\",\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":null,\"datumOd\":null,\"datumDo\":null,\"druhAkce\":\"R\",\"vsichniUciteleUcitIdno\":\"\",\"vsichniUciteleJmenaTituly\":\"\",\"vsichniUcitelePrijmeni\":\"\",\"referencedIdno\":276695,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"T_HAUER\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":null,\"nazev\":\"UAI/755\",\"katedra\":\"UAI\",\"predmet\":\"755\",\"statut\":null,\"ucitIdno\":4009,\"ucitel\":{\"ucitIdno\":4009,\"jmeno\":\"Jiří\",\"prijmeni\":\"Pech\",\"titulPred\":\"Mgr.\",\"titulZa\":\"Ph.D.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"BB\",\"mistnost\":\"1\",\"kapacitaMistnosti\":50,\"planObsazeni\":8,\"obsazeni\":6,\"typAkce\":\"Zápočet\",\"typAkceZkr\":\"Zápočet\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Úterý\",\"denZkr\":\"Út\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"07:50\"},\"hodinaSkutDo\":{\"value\":\"08:00\"},\"tydenOd\":51,\"tydenDo\":51,\"tyden\":\"Jiný\",\"tydenZkr\":\"J\",\"grupIdno\":null,\"jeNadrazena\":null,\"maNadrazenou\":null,\"kontakt\":\"Zacatek v 8:00\",\"krouzky\":null,\"casovaRada\":null,\"datum\":{\"value\":\"20.12.2016\"},\"datumOd\":{\"value\":\"20.12.2016\"},\"datumDo\":{\"value\":\"20.12.2016\"},\"druhAkce\":\"Z\",\"vsichniUciteleUcitIdno\":\"4009\",\"vsichniUciteleJmenaTituly\":\"Mgr. Jiří Pech, Ph.D.\",\"vsichniUcitelePrijmeni\":\"Pech\",\"referencedIdno\":247763,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"PECHJ\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":null,\"nazev\":\"UAI/682\",\"katedra\":\"UAI\",\"predmet\":\"682\",\"statut\":null,\"ucitIdno\":7766,\"ucitel\":{\"ucitIdno\":7766,\"jmeno\":\"Břetislav\",\"prijmeni\":\"Bakala\",\"titulPred\":\"Ing. Bc.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"AV\",\"mistnost\":\"Pč4\",\"kapacitaMistnosti\":27,\"planObsazeni\":null,\"obsazeni\":6,\"typAkce\":\"Zkouška\",\"typAkceZkr\":\"Zkouška\",\"semestr\":\"ZL\",\"platnost\":\"A\",\"den\":\"Úterý\",\"denZkr\":\"Út\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"16:00\"},\"hodinaSkutDo\":{\"value\":\"17:30\"},\"tydenOd\":1,\"tydenDo\":1,\"tyden\":\"Jiný\",\"tydenZkr\":\"J\",\"grupIdno\":null,\"jeNadrazena\":null,\"maNadrazenou\":null,\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":{\"value\":\"3.1.2017\"},\"datumOd\":{\"value\":\"3.1.2017\"},\"datumDo\":{\"value\":\"3.1.2017\"},\"druhAkce\":\"Z\",\"vsichniUciteleUcitIdno\":\"7766\",\"vsichniUciteleJmenaTituly\":\"Ing. Bc. Břetislav Bakala\",\"vsichniUcitelePrijmeni\":\"Bakala\",\"referencedIdno\":254758,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"BAKALA\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":null,\"nazev\":\"UAI/732\",\"katedra\":\"UAI\",\"predmet\":\"732\",\"statut\":null,\"ucitIdno\":6929,\"ucitel\":{\"ucitIdno\":6929,\"jmeno\":\"Ladislav\",\"prijmeni\":\"Lhotka\",\"titulPred\":\"Ing.\",\"titulZa\":\"CSc.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"BC\",\"mistnost\":\"C1\",\"kapacitaMistnosti\":60,\"planObsazeni\":25,\"obsazeni\":12,\"typAkce\":\"Zkouška\",\"typAkceZkr\":\"Zkouška\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Pondělí\",\"denZkr\":\"Po\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"08:00\"},\"hodinaSkutDo\":{\"value\":\"12:00\"},\"tydenOd\":2,\"tydenDo\":2,\"tyden\":\"Jiný\",\"tydenZkr\":\"J\",\"grupIdno\":null,\"jeNadrazena\":null,\"maNadrazenou\":null,\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":{\"value\":\"9.1.2017\"},\"datumOd\":{\"value\":\"9.1.2017\"},\"datumDo\":{\"value\":\"9.1.2017\"},\"druhAkce\":\"Z\",\"vsichniUciteleUcitIdno\":\"6929\",\"vsichniUciteleJmenaTituly\":\"Ing. Ladislav Lhotka, CSc.\",\"vsichniUcitelePrijmeni\":\"Lhotka\",\"referencedIdno\":253331,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"LHOTKA\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":null,\"nazev\":\"UAI/699\",\"katedra\":\"UAI\",\"predmet\":\"699\",\"statut\":null,\"ucitIdno\":7766,\"ucitel\":{\"ucitIdno\":7766,\"jmeno\":\"Břetislav\",\"prijmeni\":\"Bakala\",\"titulPred\":\"Ing. Bc.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"AV\",\"mistnost\":\"307\",\"kapacitaMistnosti\":10,\"planObsazeni\":4,\"obsazeni\":2,\"typAkce\":\"Zkouška\",\"typAkceZkr\":\"Zkouška\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Úterý\",\"denZkr\":\"Út\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"09:00\"},\"hodinaSkutDo\":{\"value\":\"09:55\"},\"tydenOd\":2,\"tydenDo\":2,\"tyden\":\"Jiný\",\"tydenZkr\":\"J\",\"grupIdno\":null,\"jeNadrazena\":null,\"maNadrazenou\":null,\"kontakt\":\"Po splněném zápočtu\",\"krouzky\":null,\"casovaRada\":null,\"datum\":{\"value\":\"10.1.2017\"},\"datumOd\":{\"value\":\"10.1.2017\"},\"datumDo\":{\"value\":\"10.1.2017\"},\"druhAkce\":\"Z\",\"vsichniUciteleUcitIdno\":\"7766\",\"vsichniUciteleJmenaTituly\":\"Ing. Bc. Břetislav Bakala\",\"vsichniUcitelePrijmeni\":\"Bakala\",\"referencedIdno\":247615,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"BAKALA\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":null,\"nazev\":\"UAI/735\",\"katedra\":\"UAI\",\"predmet\":\"735\",\"statut\":null,\"ucitIdno\":24299,\"ucitel\":{\"ucitIdno\":24299,\"jmeno\":\"Jan\",\"prijmeni\":\"Fesl\",\"titulPred\":\"Ing.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"BC\",\"mistnost\":\"C3\",\"kapacitaMistnosti\":30,\"planObsazeni\":null,\"obsazeni\":17,\"typAkce\":\"Zkouška\",\"typAkceZkr\":\"Zkouška\",\"semestr\":\"ZL\",\"platnost\":\"A\",\"den\":\"Úterý\",\"denZkr\":\"Út\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"09:30\"},\"hodinaSkutDo\":{\"value\":\"16:00\"},\"tydenOd\":2,\"tydenDo\":2,\"tyden\":\"Jiný\",\"tydenZkr\":\"J\",\"grupIdno\":null,\"jeNadrazena\":null,\"maNadrazenou\":null,\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":{\"value\":\"10.1.2017\"},\"datumOd\":{\"value\":\"10.1.2017\"},\"datumDo\":{\"value\":\"10.1.2017\"},\"druhAkce\":\"Z\",\"vsichniUciteleUcitIdno\":\"24299\",\"vsichniUciteleJmenaTituly\":\"Ing. Jan Fesl\",\"vsichniUcitelePrijmeni\":\"Fesl\",\"referencedIdno\":255095,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"JFESL\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":null,\"nazev\":\"UAI/683\",\"katedra\":\"UAI\",\"predmet\":\"683\",\"statut\":null,\"ucitIdno\":5046,\"ucitel\":{\"ucitIdno\":5046,\"jmeno\":\"Miloš\",\"prijmeni\":\"Prokýšek\",\"titulPred\":\"Mgr.\",\"titulZa\":\"Ph.D.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"AV\",\"mistnost\":\"307\",\"kapacitaMistnosti\":10,\"planObsazeni\":null,\"obsazeni\":3,\"typAkce\":\"Zkouška\",\"typAkceZkr\":\"Zkouška\",\"semestr\":\"ZL\",\"platnost\":\"A\",\"den\":\"Středa\",\"denZkr\":\"St\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"10:00\"},\"hodinaSkutDo\":{\"value\":\"12:00\"},\"tydenOd\":2,\"tydenDo\":2,\"tyden\":\"Jiný\",\"tydenZkr\":\"J\",\"grupIdno\":null,\"jeNadrazena\":null,\"maNadrazenou\":null,\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":{\"value\":\"11.1.2017\"},\"datumOd\":{\"value\":\"11.1.2017\"},\"datumDo\":{\"value\":\"11.1.2017\"},\"druhAkce\":\"Z\",\"vsichniUciteleUcitIdno\":\"5046\",\"vsichniUciteleJmenaTituly\":\"Mgr. Miloš Prokýšek, Ph.D.\",\"vsichniUcitelePrijmeni\":\"Prokýšek\",\"referencedIdno\":257486,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"PROKYSEK\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":null,\"nazev\":\"UAI/719\",\"katedra\":\"UAI\",\"predmet\":\"719\",\"statut\":null,\"ucitIdno\":6927,\"ucitel\":{\"ucitIdno\":6927,\"jmeno\":\"Luděk\",\"prijmeni\":\"Rašek\",\"titulPred\":\"Ing.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"BC\",\"mistnost\":\"C1\",\"kapacitaMistnosti\":60,\"planObsazeni\":null,\"obsazeni\":32,\"typAkce\":\"Zkouška\",\"typAkceZkr\":\"Zkouška\",\"semestr\":\"ZS\",\"platnost\":\"A\",\"den\":\"Čtvrtek\",\"denZkr\":\"Čt\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"08:00\"},\"hodinaSkutDo\":{\"value\":\"12:00\"},\"tydenOd\":2,\"tydenDo\":2,\"tyden\":\"Jiný\",\"tydenZkr\":\"J\",\"grupIdno\":null,\"jeNadrazena\":null,\"maNadrazenou\":null,\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":{\"value\":\"12.1.2017\"},\"datumOd\":{\"value\":\"12.1.2017\"},\"datumDo\":{\"value\":\"12.1.2017\"},\"druhAkce\":\"Z\",\"vsichniUciteleUcitIdno\":\"6927\",\"vsichniUciteleJmenaTituly\":\"Ing. Luděk Rašek\",\"vsichniUcitelePrijmeni\":\"Rašek\",\"referencedIdno\":250958,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"HANZALOVA\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":null,\"nazev\":\"UAI/771\",\"katedra\":\"UAI\",\"predmet\":\"771\",\"statut\":null,\"ucitIdno\":24299,\"ucitel\":{\"ucitIdno\":24299,\"jmeno\":\"Jan\",\"prijmeni\":\"Fesl\",\"titulPred\":\"Ing.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"AV\",\"mistnost\":\"207\",\"kapacitaMistnosti\":10,\"planObsazeni\":null,\"obsazeni\":11,\"typAkce\":\"Zkouška\",\"typAkceZkr\":\"Zkouška\",\"semestr\":\"ZL\",\"platnost\":\"A\",\"den\":\"Čtvrtek\",\"denZkr\":\"Čt\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"08:00\"},\"hodinaSkutDo\":{\"value\":\"20:00\"},\"tydenOd\":19,\"tydenDo\":19,\"tyden\":\"Jiný\",\"tydenZkr\":\"J\",\"grupIdno\":null,\"jeNadrazena\":null,\"maNadrazenou\":null,\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":{\"value\":\"11.5.2017\"},\"datumOd\":{\"value\":\"11.5.2017\"},\"datumDo\":{\"value\":\"11.5.2017\"},\"druhAkce\":\"Z\",\"vsichniUciteleUcitIdno\":\"24299\",\"vsichniUciteleJmenaTituly\":\"Ing. Jan Fesl\",\"vsichniUcitelePrijmeni\":\"Fesl\",\"referencedIdno\":268360,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"JFESL\",\"zakazaneAkce\":null,\"vyucJazyk\":null},{\"roakIdno\":null,\"nazev\":\"UAI/698\",\"katedra\":\"UAI\",\"predmet\":\"698\",\"statut\":null,\"ucitIdno\":8381,\"ucitel\":{\"ucitIdno\":8381,\"jmeno\":\"Miroslav\",\"prijmeni\":\"Skrbek\",\"titulPred\":\"Ing.\",\"titulZa\":\"Ph.D.\",\"platnost\":\"A\",\"zamestnanec\":\"A\"},\"rok\":\"2016\",\"budova\":\"BB\",\"mistnost\":\"2\",\"kapacitaMistnosti\":100,\"planObsazeni\":50,\"obsazeni\":11,\"typAkce\":\"Zkouška\",\"typAkceZkr\":\"Zkouška\",\"semestr\":\"ZL\",\"platnost\":\"A\",\"den\":\"Pondělí\",\"denZkr\":\"Po\",\"hodinaOd\":null,\"hodinaDo\":null,\"hodinaSkutOd\":{\"value\":\"10:00\"},\"hodinaSkutDo\":{\"value\":\"12:00\"},\"tydenOd\":23,\"tydenDo\":23,\"tyden\":\"Jiný\",\"tydenZkr\":\"J\",\"grupIdno\":null,\"jeNadrazena\":null,\"maNadrazenou\":null,\"kontakt\":null,\"krouzky\":null,\"casovaRada\":null,\"datum\":{\"value\":\"5.6.2017\"},\"datumOd\":{\"value\":\"5.6.2017\"},\"datumDo\":{\"value\":\"5.6.2017\"},\"druhAkce\":\"Z\",\"vsichniUciteleUcitIdno\":\"8381\",\"vsichniUciteleJmenaTituly\":\"Ing. Miroslav Skrbek, Ph.D.\",\"vsichniUcitelePrijmeni\":\"Skrbek\",\"referencedIdno\":272344,\"poznamkaRozvrhare\":null,\"nekonaSe\":null,\"owner\":\"MSKRBEK\",\"zakazaneAkce\":null,\"vyucJazyk\":null}]}]";
    }

    public TimeTable fetchCurrentTimetable()
    {
//        return new TimeTable();
        throw new NotImplementedException();
    }

}
