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
        choiceBox1.getItems().addAll("Everywhere","Abrud",
                "Adjud",
                "Aiud",
                "Alba Iulia",
                "Aleşd",
                "Alexandria",
                "Agnita",
                "Anina",
                "Aninoasa",
                "Arad",
                "Avrig",
                "Azuga",
                "Babadag",
                "Bacău",
                "Baia de Aramă",
                "Baia de Arieş",
                "Baia Mare",
                "Baia Sprie",
                "Balş",
                "Baraolt",
                "Băicoi",
                "Băile Govora",
                "Băile Herculane",
                "Băile Olăneşti",
                "Băileşti",
                "Băile Tuşnad",
                "Bălan",
                "Bârlad",
                "Bocşa",
                "Borsec",
                "Beclean",
                "Beiuş",
                "Bereşti",
                "Bicaz",
                "Bistriţa",
                "Blaj",
                "Boldeşti-Scăieni",
                "Bolintin-Vale",
                "Borşa",
                "Botoşani",
                "Brad",
                "Braşov",
                "Brăila",
                "Breaza",
                "Brezoi",
                "Bucureşti",
                "Budeşti",
                "Buftea",
                "Buhuşi",
                "Bumbeşti-Jiu",
                "Buşteni",
                "Buziaş",
                "Buzău",
                "Calafat",
                "Carei",
                "Caracal",
                "Caransebeş",
                "Cavnic",
                "Călan",
                "Călăraşi",
                "Călimăneşti-Căciulata",
                "Câmpeni",
                "Câmpia Turzii",
                "Câmpina",
                "Câmpulung",
                "Câmpulung Moldovenesc",
                "Cehu Silvaniei",
                "Cernavodă",
                "Chişineu-Criş",
                "Cisnădie",
                "Cluj-Napoca",
                "Codlea",
                "Comarnic",
                "Comăneşti",
                "Constanţa",
                "Copşa Mică",
                "Corabia",
                "Costeşti",
                "Covasna",
                "Craiova",
                "Cristuru Secuiesc",
                "Cugir",
                "Curtici",
                "Curtea de Argeş",
                "Darabani",
                "Dărmăneşti",
                "Dealu",
                "Dej",
                "Deta",
                "Deva",
                "Dorohoi",
                "Drăgăneşti-Olt",
                "Drăgăşani",
                "Drobeta-Turnu Severin",
                "Dumbrăveni",
                "Eforie",
                "Făgăraş",
                "Făget",
                "Fălticeni",
                "Făurei",
                "Feteşti",
                "Fieni",
                "Filiaşi",
                "Focşani",
                "Fundulea",
                "Galaţi",
                "Găeşti",
                "Geoagiu",
                "Gheorgheni",
                "Gherla",
                "Giurgiu",
                "Gura Humorului",
                "Haţeg",
                "Hârlău",
                "Hârşova",
                "Horezu",
                "Huedin",
                "Hunedoara",
                "Huşi",
                "Ianca",
                "Iaşi",
                "Iernut",
                "Ineu",
                "Isaccea",
                "Însurăţei",
                "Întorsura Buzăului",
                "Jibou",
                "Jimbolia",
                "Lehliu Gară",
                "Lipova",
                "Luduş",
                "Lugoj",
                "Lupeni",
                "Mangalia",
                "Marghita",
                "Măcin",
                "Mărăşeşti",
                "Medgidia",
                "Mediaş",
                "Miercurea Ciuc",
                "Mihăileşti",
                "Mioveni",
                "Mizil",
                "Moineşti",
                "Moldova Nouă",
                "Moreni",
                "Motru",
                "Murfatlar",
                "Nădlac",
                "Năsăud",
                "Năvodari",
                "Negreşti",
                "Negreşti-Oaş",
                "Negru Vodă",
                "Nehoiu",
                "Novaci",
                "Nucet",
                "Ocna Mureş",
                "Ocna Sibiului",
                "Ocnele Mari",
                "Odobeşti",
                "Odorheiu Secuiesc",
                "Olteniţa",
                "Oneşti",
                "Oradea",
                "Oraviţa",
                "Orăştie",
                "Orşova",
                "Otopeni",
                "Oţelu Roşu",
                "Ovidiu",
                "Panciu",
                "Paşcani",
                "Pâncota",
                "Pecica",
                "Petrila",
                "Petroşani",
                "Piatra Neamţ",
                "Piatra Olt",
                "Piteşti",
                "Ploieşti",
                "Plopeni",
                "Pogoanele",
                "Predeal",
                "Pucioasa",
                "Rădăuţi",
                "Râmnicu Sărat",
                "Râmnicu Vâlcea",
                "Râşnov",
                "Reghin",
                "Reşiţa",
                "Roman",
                "Roşiori de Vede",
                "Rovinari",
                "Rupea",
                "Salonta",
                "Satu Mare",
                "Săcele",
                "Săveni",
                "Sângeorz-Băi",
                "Sânnicolau Mare",
                "Scorniceşti",
                "Sebeş",
                "Sebiş",
                "Seini",
                "Segarcea",
                "Sfântu Gheorghe",
                "Sibiu",
                "Sighetu Marmaţiei",
                "Sighişoara",
                "Simeria",
                "Sinaia",
                "Siret",
                "Slatina",
                "Slănic",
                "Slănic Moldova",
                "Slobozia",
                "Solca",
                "Sovata",
                "Strehaia",
                "Suceava",
                "Sulina",
                "Şimleu Silvaniei",
                "Ştei",
                "Tălmaciu",
                "Tăşnad",
                "Târgovişte",
                "Târgu Bujor",
                "Târgu Cărbuneşti",
                "Târgu Frumos",
                "Târgu Jiu",
                "Târgu Lăpuş",
                "Târgu Mureş",
                "Târgu Neamţ",
                "Târgu Ocna",
                "Târgu Secuiesc",
                "Târnăveni",
                "Techirghiol",
                "Tecuci",
                "Teiuş",
                "Timişoara",
                "Tismana",
                "Titu",
                "Topliţa",
                "Topoloveni",
                "Tulcea",
                "Turda",
                "Turnu Măgurele",
                "Ţăndărei",
                "Ţicleni",
                "Uricani",
                "Urlaţi",
                "Urziceni",
                "Valea lui Mihai",
                "Vaslui",
                "Vaşcău",
                "Vatra Dornei",
                "Vălenii de Munte",
                "Vânju Mare",
                "Victoria",
                "Videle",
                "Vişeu de Sus",
                "Vlăhiţa",
                "Vulcan",
                "Zalău",
                "Zărneşti",
                "Zimnicea",
                "Zlatna");
        choiceBox2.getItems().addAll("Everywhere","Abrud",
                "Adjud",
                "Aiud",
                "Alba Iulia",
                "Aleşd",
                "Alexandria",
                "Agnita",
                "Anina",
                "Aninoasa",
                "Arad",
                "Avrig",
                "Azuga",
                "Babadag",
                "Bacău",
                "Baia de Aramă",
                "Baia de Arieş",
                "Baia Mare",
                "Baia Sprie",
                "Balş",
                "Baraolt",
                "Băicoi",
                "Băile Govora",
                "Băile Herculane",
                "Băile Olăneşti",
                "Băileşti",
                "Băile Tuşnad",
                "Bălan",
                "Bârlad",
                "Bocşa",
                "Borsec",
                "Beclean",
                "Beiuş",
                "Bereşti",
                "Bicaz",
                "Bistriţa",
                "Blaj",
                "Boldeşti-Scăieni",
                "Bolintin-Vale",
                "Borşa",
                "Botoşani",
                "Brad",
                "Braşov",
                "Brăila",
                "Breaza",
                "Brezoi",
                "Bucureşti",
                "Budeşti",
                "Buftea",
                "Buhuşi",
                "Bumbeşti-Jiu",
                "Buşteni",
                "Buziaş",
                "Buzău",
                "Calafat",
                "Carei",
                "Caracal",
                "Caransebeş",
                "Cavnic",
                "Călan",
                "Călăraşi",
                "Călimăneşti-Căciulata",
                "Câmpeni",
                "Câmpia Turzii",
                "Câmpina",
                "Câmpulung",
                "Câmpulung Moldovenesc",
                "Cehu Silvaniei",
                "Cernavodă",
                "Chişineu-Criş",
                "Cisnădie",
                "Cluj-Napoca",
                "Codlea",
                "Comarnic",
                "Comăneşti",
                "Constanţa",
                "Copşa Mică",
                "Corabia",
                "Costeşti",
                "Covasna",
                "Craiova",
                "Cristuru Secuiesc",
                "Cugir",
                "Curtici",
                "Curtea de Argeş",
                "Darabani",
                "Dărmăneşti",
                "Dealu",
                "Dej",
                "Deta",
                "Deva",
                "Dorohoi",
                "Drăgăneşti-Olt",
                "Drăgăşani",
                "Drobeta-Turnu Severin",
                "Dumbrăveni",
                "Eforie",
                "Făgăraş",
                "Făget",
                "Fălticeni",
                "Făurei",
                "Feteşti",
                "Fieni",
                "Filiaşi",
                "Focşani",
                "Fundulea",
                "Galaţi",
                "Găeşti",
                "Geoagiu",
                "Gheorgheni",
                "Gherla",
                "Giurgiu",
                "Gura Humorului",
                "Haţeg",
                "Hârlău",
                "Hârşova",
                "Horezu",
                "Huedin",
                "Hunedoara",
                "Huşi",
                "Ianca",
                "Iaşi",
                "Iernut",
                "Ineu",
                "Isaccea",
                "Însurăţei",
                "Întorsura Buzăului",
                "Jibou",
                "Jimbolia",
                "Lehliu Gară",
                "Lipova",
                "Luduş",
                "Lugoj",
                "Lupeni",
                "Mangalia",
                "Marghita",
                "Măcin",
                "Mărăşeşti",
                "Medgidia",
                "Mediaş",
                "Miercurea Ciuc",
                "Mihăileşti",
                "Mioveni",
                "Mizil",
                "Moineşti",
                "Moldova Nouă",
                "Moreni",
                "Motru",
                "Murfatlar",
                "Nădlac",
                "Năsăud",
                "Năvodari",
                "Negreşti",
                "Negreşti-Oaş",
                "Negru Vodă",
                "Nehoiu",
                "Novaci",
                "Nucet",
                "Ocna Mureş",
                "Ocna Sibiului",
                "Ocnele Mari",
                "Odobeşti",
                "Odorheiu Secuiesc",
                "Olteniţa",
                "Oneşti",
                "Oradea",
                "Oraviţa",
                "Orăştie",
                "Orşova",
                "Otopeni",
                "Oţelu Roşu",
                "Ovidiu",
                "Panciu",
                "Paşcani",
                "Pâncota",
                "Pecica",
                "Petrila",
                "Petroşani",
                "Piatra Neamţ",
                "Piatra Olt",
                "Piteşti",
                "Ploieşti",
                "Plopeni",
                "Pogoanele",
                "Predeal",
                "Pucioasa",
                "Rădăuţi",
                "Râmnicu Sărat",
                "Râmnicu Vâlcea",
                "Râşnov",
                "Reghin",
                "Reşiţa",
                "Roman",
                "Roşiori de Vede",
                "Rovinari",
                "Rupea",
                "Salonta",
                "Satu Mare",
                "Săcele",
                "Săveni",
                "Sângeorz-Băi",
                "Sânnicolau Mare",
                "Scorniceşti",
                "Sebeş",
                "Sebiş",
                "Seini",
                "Segarcea",
                "Sfântu Gheorghe",
                "Sibiu",
                "Sighetu Marmaţiei",
                "Sighişoara",
                "Simeria",
                "Sinaia",
                "Siret",
                "Slatina",
                "Slănic",
                "Slănic Moldova",
                "Slobozia",
                "Solca",
                "Sovata",
                "Strehaia",
                "Suceava",
                "Sulina",
                "Şimleu Silvaniei",
                "Ştei",
                "Tălmaciu",
                "Tăşnad",
                "Târgovişte",
                "Târgu Bujor",
                "Târgu Cărbuneşti",
                "Târgu Frumos",
                "Târgu Jiu",
                "Târgu Lăpuş",
                "Târgu Mureş",
                "Târgu Neamţ",
                "Târgu Ocna",
                "Târgu Secuiesc",
                "Târnăveni",
                "Techirghiol",
                "Tecuci",
                "Teiuş",
                "Timişoara",
                "Tismana",
                "Titu",
                "Topliţa",
                "Topoloveni",
                "Tulcea",
                "Turda",
                "Turnu Măgurele",
                "Ţăndărei",
                "Ţicleni",
                "Uricani",
                "Urlaţi",
                "Urziceni",
                "Valea lui Mihai",
                "Vaslui",
                "Vaşcău",
                "Vatra Dornei",
                "Vălenii de Munte",
                "Vânju Mare",
                "Victoria",
                "Videle",
                "Vişeu de Sus",
                "Vlăhiţa",
                "Vulcan",
                "Zalău",
                "Zărneşti",
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

