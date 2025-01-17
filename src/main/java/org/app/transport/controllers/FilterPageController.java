package org.app.transport.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class FilterPageController {
@FXML
    private ChoiceBox<String> choiceBox1;
@FXML
    private ChoiceBox<String> choiceBox2;
private String username;
@FXML
private Button filter;
    @FXML
    public void initialize()
    {
        choiceBox1.getItems().addAll("Everywhere", "Abrud",
                "Adjud",
                "Aiud",
                "Alba Iulia",
                "Alesd",
                "Alexandria",
                "Agnita",
                "Anina",
                "Aninoasa",
                "Arad",
                "Avrig",
                "Azuga",
                "Babadag",
                "Bacau",
                "Baia de Arama",
                "Baia de Aries",
                "Baia Mare",
                "Baia Sprie",
                "Bals",
                "Baraolt",
                "Baicoi",
                "Baile Govora",
                "Baile Herculane",
                "Baile Olanesti",
                "Bailesti",
                "Baile Tusnad",
                "Balan",
                "Barlad",
                "Bocsa",
                "Borsec",
                "Beclean",
                "Beius",
                "Beresti",
                "Bicaz",
                "Bistrita",
                "Blaj",
                "Boldesti-Scaieni",
                "Bolintin-Vale",
                "Borsa",
                "Botosani",
                "Brad",
                "Brasov",
                "Braila",
                "Breaza",
                "Brezoi",
                "Bucuresti",
                "Budesti",
                "Buftea",
                "Buhusi",
                "Bumbesti-Jiu",
                "Busteni",
                "Buzias",
                "Buzau",
                "Calafat",
                "Carei",
                "Caracal",
                "Caransebes",
                "Cavnic",
                "Calan",
                "Calarasi",
                "Calimanesti-Caciulata",
                "Campeni",
                "Campia Turzii",
                "Campina",
                "Campulung",
                "Campulung Moldovenesc",
                "Cehu Silvaniei",
                "Cernavoda",
                "Chisineu-Cris",
                "Cisnadie",
                "Cluj-Napoca",
                "Codlea",
                "Comarnic",
                "Comanesti",
                "Constanta",
                "Copsa Mica",
                "Corabia",
                "Costesti",
                "Covasna",
                "Craiova",
                "Cristuru Secuiesc",
                "Cugir",
                "Curtici",
                "Curtea de Arges",
                "Darabani",
                "Darmanesti",
                "Dealu",
                "Dej",
                "Deta",
                "Deva",
                "Dorohoi",
                "Draganesti-Olt",
                "Dragasani",
                "Drobeta-Turnu Severin",
                "Dumbraveni",
                "Eforie",
                "Făgaras",
                "Faget",
                "Falticeni",
                "Faurei",
                "Fetesti",
                "Fieni",
                "Filiasi",
                "Focsani",
                "Fundulea",
                "Galati",
                "Gaesti",
                "Geoagiu",
                "Gheorgheni",
                "Gherla",
                "Giurgiu",
                "Gura Humorului",
                "Hateg",
                "Harlau",
                "Harsova",
                "Horezu",
                "Huedin",
                "Hunedoara",
                "Husi",
                "Ianca",
                "Iasi",
                "Iernut",
                "Ineu",
                "Isaccea",
                "Insuratei",
                "Intorsura Buzaului",
                "Jibou",
                "Jimbolia",
                "Lehliu Gara",
                "Lipova",
                "Ludus",
                "Lugoj",
                "Lupeni",
                "Mangalia",
                "Marghita",
                "Macin",
                "Marasesti",
                "Medgidia",
                "Medias",
                "Miercurea Ciuc",
                "Mihailesti",
                "Mioveni",
                "Mizil",
                "Moinesti",
                "Moldova Noua",
                "Moreni",
                "Motru",
                "Murfatlar",
                "Nadlac",
                "Nasaud",
                "Navodari",
                "Negreşti",
                "Negresti-Oas",
                "Negru Voda",
                "Nehoiu",
                "Novaci",
                "Nucet",
                "Ocna Mures",
                "Ocna Sibiului",
                "Ocnele Mari",
                "Odobesti",
                "Odorheiu Secuiesc",
                "Oltenita",
                "Onesti",
                "Oradea",
                "Oravita",
                "Orastie",
                "Orsova",
                "Otopeni",
                "Otelu Rosu",
                "Ovidiu",
                "Panciu",
                "Pascani",
                "Pancota",
                "Pecica",
                "Petrila",
                "Petrosani",
                "Piatra Neamt",
                "Piatra Olt",
                "Pitesti",
                "Ploiesti",
                "Plopeni",
                "Pogoanele",
                "Predeal",
                "Pucioasa",
                "Radauti",
                "Ramnicu Sarat",
                "Ramnicu Valcea",
                "Rasnov",
                "Reghin",
                "Resita",
                "Roman",
                "Rosiori de Vede",
                "Rovinari",
                "Rupea",
                "Salonta",
                "Satu Mare",
                "Sacele",
                "Saveni",
                "Sangeorz-Bai",
                "Sannicolau Mare",
                "Scornicesti",
                "Sebes",
                "Sebis",
                "Seini",
                "Segarcea",
                "Sfantu Gheorghe",
                "Sibiu",
                "Sighetu Marmatiei",
                "Sighisoara",
                "Simeria",
                "Sinaia",
                "Siret",
                "Slatina",
                "Slanic",
                "Slanic Moldova",
                "Slobozia",
                "Solca",
                "Sovata",
                "Strehaia",
                "Suceava",
                "Sulina",
                "Simleu Silvaniei",
                "Stei",
                "Talmaciu",
                "Tasnad",
                "Targoviste",
                "Targu Bujor",
                "Targu Cărbuneşti",
                "Targu Frumos",
                "Targu Jiu",
                "Targu Lăpus",
                "Targu Mures",
                "Targu Neamt",
                "Targu Ocna",
                "Targu Secuiesc",
                "Tarnaveni",
                "Techirghiol",
                "Tecuci",
                "Teius",
                "Timisoara",
                "Tismana",
                "Titu",
                "Toplita",
                "Topoloveni",
                "Tulcea",
                "Turda",
                "Turnu Magurele",
                "Tandarei",
                "Ticleni",
                "Uricani",
                "Urlati",
                "Urziceni",
                "Valea lui Mihai",
                "Vaslui",
                "Vascau",
                "Vatra Dornei",
                "Valenii de Munte",
                "Vanju Mare",
                "Victoria",
                "Videle",
                "Vişeu de Sus",
                "Vlahita",
                "Vulcan",
                "Zalau",
                "Zarnesti",
                "Zimnicea",
                "Zlatna");
        choiceBox2.getItems().addAll("Everywhere", "Abrud",
                "Adjud",
                "Aiud",
                "Alba Iulia",
                "Alesd",
                "Alexandria",
                "Agnita",
                "Anina",
                "Aninoasa",
                "Arad",
                "Avrig",
                "Azuga",
                "Babadag",
                "Bacau",
                "Baia de Arama",
                "Baia de Aries",
                "Baia Mare",
                "Baia Sprie",
                "Bals",
                "Baraolt",
                "Baicoi",
                "Baile Govora",
                "Baile Herculane",
                "Baile Olanesti",
                "Bailesti",
                "Baile Tusnad",
                "Balan",
                "Barlad",
                "Bocsa",
                "Borsec",
                "Beclean",
                "Beius",
                "Beresti",
                "Bicaz",
                "Bistrita",
                "Blaj",
                "Boldesti-Scaieni",
                "Bolintin-Vale",
                "Borsa",
                "Botosani",
                "Brad",
                "Brasov",
                "Braila",
                "Breaza",
                "Brezoi",
                "Bucuresti",
                "Budesti",
                "Buftea",
                "Buhusi",
                "Bumbesti-Jiu",
                "Busteni",
                "Buzias",
                "Buzau",
                "Calafat",
                "Carei",
                "Caracal",
                "Caransebes",
                "Cavnic",
                "Calan",
                "Calarasi",
                "Calimanesti-Caciulata",
                "Campeni",
                "Campia Turzii",
                "Campina",
                "Campulung",
                "Campulung Moldovenesc",
                "Cehu Silvaniei",
                "Cernavoda",
                "Chisineu-Cris",
                "Cisnadie",
                "Cluj-Napoca",
                "Codlea",
                "Comarnic",
                "Comanesti",
                "Constanta",
                "Copsa Mica",
                "Corabia",
                "Costesti",
                "Covasna",
                "Craiova",
                "Cristuru Secuiesc",
                "Cugir",
                "Curtici",
                "Curtea de Arges",
                "Darabani",
                "Darmanesti",
                "Dealu",
                "Dej",
                "Deta",
                "Deva",
                "Dorohoi",
                "Draganesti-Olt",
                "Dragasani",
                "Drobeta-Turnu Severin",
                "Dumbraveni",
                "Eforie",
                "Făgaras",
                "Faget",
                "Falticeni",
                "Faurei",
                "Fetesti",
                "Fieni",
                "Filiasi",
                "Focsani",
                "Fundulea",
                "Galati",
                "Gaesti",
                "Geoagiu",
                "Gheorgheni",
                "Gherla",
                "Giurgiu",
                "Gura Humorului",
                "Hateg",
                "Harlau",
                "Harsova",
                "Horezu",
                "Huedin",
                "Hunedoara",
                "Husi",
                "Ianca",
                "Iasi",
                "Iernut",
                "Ineu",
                "Isaccea",
                "Insuratei",
                "Intorsura Buzaului",
                "Jibou",
                "Jimbolia",
                "Lehliu Gara",
                "Lipova",
                "Ludus",
                "Lugoj",
                "Lupeni",
                "Mangalia",
                "Marghita",
                "Macin",
                "Marasesti",
                "Medgidia",
                "Medias",
                "Miercurea Ciuc",
                "Mihailesti",
                "Mioveni",
                "Mizil",
                "Moinesti",
                "Moldova Noua",
                "Moreni",
                "Motru",
                "Murfatlar",
                "Nadlac",
                "Nasaud",
                "Navodari",
                "Negreşti",
                "Negresti-Oas",
                "Negru Voda",
                "Nehoiu",
                "Novaci",
                "Nucet",
                "Ocna Mures",
                "Ocna Sibiului",
                "Ocnele Mari",
                "Odobesti",
                "Odorheiu Secuiesc",
                "Oltenita",
                "Onesti",
                "Oradea",
                "Oravita",
                "Orastie",
                "Orsova",
                "Otopeni",
                "Otelu Rosu",
                "Ovidiu",
                "Panciu",
                "Pascani",
                "Pancota",
                "Pecica",
                "Petrila",
                "Petrosani",
                "Piatra Neamt",
                "Piatra Olt",
                "Pitesti",
                "Ploiesti",
                "Plopeni",
                "Pogoanele",
                "Predeal",
                "Pucioasa",
                "Radauti",
                "Ramnicu Sarat",
                "Ramnicu Valcea",
                "Rasnov",
                "Reghin",
                "Resiţa",
                "Roman",
                "Rosiori de Vede",
                "Rovinari",
                "Rupea",
                "Salonta",
                "Satu Mare",
                "Sacele",
                "Saveni",
                "Sangeorz-Bai",
                "Sannicolau Mare",
                "Scornicesti",
                "Sebes",
                "Sebis",
                "Seini",
                "Segarcea",
                "Sfantu Gheorghe",
                "Sibiu",
                "Sighetu Marmatiei",
                "Sighisoara",
                "Simeria",
                "Sinaia",
                "Siret",
                "Slatina",
                "Slanic",
                "Slanic Moldova",
                "Slobozia",
                "Solca",
                "Sovata",
                "Strehaia",
                "Suceava",
                "Sulina",
                "Simleu Silvaniei",
                "Stei",
                "Talmaciu",
                "Tasnad",
                "Targoviste",
                "Targu Bujor",
                "Targu Cărbuneşti",
                "Targu Frumos",
                "Targu Jiu",
                "Targu Lăpus",
                "Targu Mures",
                "Targu Neamt",
                "Targu Ocna",
                "Targu Secuiesc",
                "Tarnaveni",
                "Techirghiol",
                "Tecuci",
                "Teius",
                "Timisoara",
                "Tismana",
                "Titu",
                "Toplita",
                "Topoloveni",
                "Tulcea",
                "Turda",
                "Turnu Magurele",
                "Tandarei",
                "Ticleni",
                "Uricani",
                "Urlati",
                "Urziceni",
                "Valea lui Mihai",
                "Vaslui",
                "Vascau",
                "Vatra Dornei",
                "Valenii de Munte",
                "Vanju Mare",
                "Victoria",
                "Videle",
                "Vişeu de Sus",
                "Vlahita",
                "Vulcan",
                "Zalau",
                "Zarnesti",
                "Zimnicea",
                "Zlatna");
    }

    public void handleFiltration(MouseEvent mouseEvent) {
        try {


            FXMLLoader loader = new FXMLLoader(getClass().getResource("/GoodList.fxml"));
            Parent root = (Parent) loader.load();
            GoodListController log=loader.getController();
            if(choiceBox1.getValue()==null&&choiceBox2.getValue()!=null)
            log.setUsername(username,"Everywhere",choiceBox2.getValue());
            else
            if(choiceBox1.getValue()!=null&&choiceBox2.getValue()==null)
                log.setUsername(username,choiceBox1.getValue(),"Everywhere");
            else
            if(choiceBox1.getValue()==null&&choiceBox2.getValue()==null)
                log.setUsername(username,"Everywhere","Everywhere");
            else
                log.setUsername(username,choiceBox1.getValue(),choiceBox2.getValue());
            Stage window = (Stage) filter.getScene().getWindow();
            window.setScene(new Scene(root, 500, 400));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void setUserName(String username) {
        this.username=username;
    }
}

