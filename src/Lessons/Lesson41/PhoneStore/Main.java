package Lessons.Lesson41.PhoneStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static Store store = new Store("Bryce's Store");

    public static void main(String[] args) {


        store.addProduct("260007", "Smart Eload 200 SM200", 209.00);
        store.addProduct("260008", "Smart Eload 250 SM250", 168.00);
        store.addProduct("260009", "Smart Eload 300 SM300", 69.00);
        store.addProduct("260010", "Smart Eload 500 SM500", 164.00);
        store.addProduct("260011", "Smart Eload 1000 SM1000", 217.00);
        store.addProduct("260012", "Smart All Text Plus 20 SMAT20", 169.00);
        store.addProduct("260013", "Smart LahatTxt 20(for Talk N Text subscriber only) SMLT20", 113.00);
        store.addProduct("260014", "Smart LahatTxt 30(for Smart and TNT subscribers) SMLT30", 132.00);
        store.addProduct("260015", "Smart GaanTxt 20(for Talk N Text subscribers only) SMGT20", 178.00);
        store.addProduct("260016", "Smart All Text 10 (for Smart and TNT subscribers) SMAT10", 166.00);
        store.addProduct("260017", "Smart GaanTxt Plus 10 (for TNT subs only) SMGTP10", 127.00);
        store.addProduct("260018", "Smart Big Bytes 50 SMBB50", 107.00);
        store.addProduct("260019", "Smart Big Bytes 70 SMBB70", 119.00);
        store.addProduct("260020", "Smart BRO 15 SMBRO15", 83.00);
        store.addProduct("260021", "Smart BRO 30 SMBRO30", 121.00);
        store.addProduct("260022", "Smart BRO 50 SMBRO50", 109.00);
        store.addProduct("260023", "Smart BRO 60 SMBRO60", 181.00);
        store.addProduct("260024", "Smart BRO 100 SMBRO100", 50.00);
        store.addProduct("260025", "Smart BRO 115 SMBRO115", 90.00);
        store.addProduct("260026", "Smart BRO 200 SMBRO200", 139.00);
        store.addProduct("260027", "Smart BRO 300 SMBRO300", 208.00);
        store.addProduct("260028", "Smart BRO 500 SMBRO500", 143.00);
        store.addProduct("260029", "Smart BRO Unlisurf 85 (2 days Unlimited internet) SMBROUnli85", 99.00);
        store.addProduct("260030", "Smart BRO Surf Max 50 SMBROSURFMAX50", 124.00);
        store.addProduct("260031", "Smart BRO Surf Max 85 SMBROSURFMAX85", 85.00);
        store.addProduct("260032", "Smart BRO Surf Max 200 SMBROSURFMAX200", 73.00);
        store.addProduct("260033", "Smart BRO Surf Max 250 SMBROSURFMAX250", 133.00);
        store.addProduct("260034", "Smart BRO Surf Max 500 SMBROSURFMAX500", 77.00);
        store.addProduct("260035", "Smart BRO Surf Max 995 SMBROSURFMAX995", 168.00);
        store.addProduct("260036", "Smart Surf Max 50 SMSURFMAX50", 201.00);
        store.addProduct("260037", "Smart Surf Max 299 SMSURFMAX299", 234.00);
        store.addProduct("260038", "Smart Surf Max 999 SMSURFMAX999", 194.00);
        store.addProduct("260039", "Smart Surf Max Plus 50 SMSURFMAXPLS50", 167.00);
        store.addProduct("260040", "Smart Surf Max Plus 299 SMSURFMAXPLS299", 80.00);
        store.addProduct("260041", "Smart Surf Max Plus 995 SMSURFMAXPLS995", 97.00);
        store.addProduct("260042", "Smart Giga Surf 50 (for Smart subscribers only) SMGS50", 173.00);
        store.addProduct("260043", "Smart Giga Surf 99 (BRO) SMBROGS99", 150.00);
        store.addProduct("260044", "Smart All Out Surf 20 (for Smart subscribers only) SMAOS20", 59.00);
        store.addProduct("260045", "Smart All Out Surf 30 (HERO OFFER) (for Smart sub SMAOS30", 174.00);
        store.addProduct("260046", "Smart All Out Surf 50 (for Smart subscribers only) SMAOS50", 196.00);
        store.addProduct("260047", "Smart All Out Surf 99 (for Smart subscribers only) SMAOS99", 219.00);
        store.addProduct("260048", "Smart Sakto Surf 30 (for Smart subscribers only) SMSS30", 107.00);
        store.addProduct("260049", "Smart Sakto Surf 99 (for Smart subscribers only) SMSS99", 149.00);
        store.addProduct("260050", "Smart Giga Surf 50 (BRO) SMBROGS50", 85.00);
        store.addProduct("260051", "Smart Enhanced UCT 30 (for Smart subscribers only) SMUCT30", 177.00);
        store.addProduct("260052", "Smart Enhanced UCT 50 (for Smart subscribers only) SMUCT50", 186.00);
        store.addProduct("260053", "Smart UCT 100 (for Smart subscribers only) SMUCT100", 191.00);
        store.addProduct("260054", "Smart UCT 350 (for Smart subscribers only) SMUCT350", 206.00);
        store.addProduct("260055", "Smart BigBytes 15 (for Smart subscribers only) SMBB15", 87.00);
        store.addProduct("260056", "Smart BigBytes 30 (for Smart subscribers only) SMBB30", 161.00);
        store.addProduct("260057", "Smart Big Bytes Barkada 99 (for Smart subscribers SMBB99", 88.00);
        store.addProduct("260058", "Smart Big Bytes Barkada 299 (for Smart subscribers SMBB299", 186.00);
        store.addProduct("260059", "Smart SULITIDD50 (for Smart subscribers only) SMSIDD50", 243.00);
        store.addProduct("260060", "Smart SULITIDD100 (for Smart subscribers only) SMSIDD100", 65.00);
        store.addProduct("260061", "Smart SULITIDD500 (for Smart subscribers only) SMSIDD500", 219.00);
        store.addProduct("260062", "Smart BigBytes 15 (Bro) SMBROBB15", 208.00);
        store.addProduct("260063", "Unli Call & Text 10 (for TNT subs only) TNTUCT10", 86.00);
        store.addProduct("260064", "Facebook 10 (for TNT subs only) TNTFB10", 114.00);
        store.addProduct("260065", "Viber 10 (for TNT subs only) TNTVIBR10", 129.00);
        store.addProduct("260066", "Clash of Clans 10 (for TNT subs only) TNTCOC10", 74.00);
        store.addProduct("260067", "UnliTextPlus 10 (for TNT subs only) TNTUTP10", 154.00);
        store.addProduct("260068", "GaanSurf 10 (for TNT subs only) TNTGS10", 156.00);
        store.addProduct("260069", "Unlitext 10 (for TNT subs only) TNTUT10", 172.00);
        store.addProduct("260070", "Wonder (Load10) for Smart subs only SM10", 107.00);
        store.addProduct("260071", "Big Bytes 10 (for Smart subs only) SMBB10", 210.00);
        store.addProduct("260072", "BigBytes 10 (SMBro) SMBROBB10", 125.00);
        store.addProduct("260073", "Flexi Max 10 (for TNT subs only) TNTFM10", 200.00);
        store.addProduct("260074", "UnliTalk 15 (for TNT subs only) TNTUT15", 134.00);
        store.addProduct("260075", "UnliText Plus 15 (for TNT subs only) TNTUTP15", 191.00);
        store.addProduct("260076", "Willie - Unlitxt 15 (for TNT subs only) TNTWUT15", 235.00);
        store.addProduct("260077", "Gaan UnliTxt 15 Plus (for TNT subs only) TNTGU15", 182.00);
        store.addProduct("260078", "All Out Surf 15 (WEB) for Smart subs only SMWAO15", 68.00);
        store.addProduct("260079", "GaanSurf 15 (for TNT subs only) TNTGS15", 189.00);
        store.addProduct("260080", "Panalo IDD 20 (for TNT subs only) TNTPIDD20", 62.00);
        store.addProduct("260081", "Unli Talk Plus 20 (for TNT subs only) TNTUTP20", 67.00);
        store.addProduct("260082", "Kamustext 20 (for TNT subs only) TNTINTL20", 207.00);
        store.addProduct("260083", "Super Combo 20 (for TNT subs only) TNTSC20", 234.00);
        store.addProduct("260084", "All Day 20 (for TNT subs only) TNTAD20", 64.00);
        store.addProduct("260085", "GaanSurf 20 (for TNT subs only) TNTGS20", 122.00);
        store.addProduct("260086", "Willie - UnliTxt 20 (for TNT subs only) TNTWUT20", 185.00);
        store.addProduct("260087", "All Out Surf 20 (WEB) for Smart subs only SMWAO20", 181.00);
        store.addProduct("260088", "All-in 25 (for Smart subs only) SMAI25", 70.00);
        store.addProduct("260089", "Unlimited Call and Text 25 (UCT 25) for Smart subs only SMUCT25", 52.00);
        store.addProduct("260090", "Unli Text 2 All Plus 25 (for TNT subs only) TNTUTP25", 77.00);
        store.addProduct("260091", "GaanSurf 30 (for TNT subs only) TNTGS30", 95.00);
        store.addProduct("260092", "Flexi 30 (for TNT subs only) TNTFIDD30", 141.00);
        store.addProduct("260093", "Unlitext Extra 30 (for TNT subs only) TNTUT30", 53.00);
        store.addProduct("260094", "Gaan Unlitxt 30 Plus Enhancement (for TNT subs only) TNTGU30", 95.00);
        store.addProduct("260095", "All Day 30 (for TNT subs only) TNTAD30", 99.00);
        store.addProduct("260096", "Giga Surf 50 (SMBro) SMBROBB50", 151.00);
        store.addProduct("260097", "SURFMAX 50 (for TNT subs only) TNTSFMX50", 93.00);
        store.addProduct("260098", "Panalo IDD 50 (for TNT subs only) TNTPIDD50", 64.00);
        store.addProduct("260099", "UnliTxtPlus 50 (for Smart subs only) SMUTP50", 149.00);
        store.addProduct("260100", "Flexi 50 (for TNT subs only) TNTFIDD50", 118.00);
        store.addProduct("260101", "Unlitext2All Plus 60 (UAPlus60) for Smart,TNT SMUAP60", 120.00);
        store.addProduct("260102", "Big Bytes 70 (SMBro) SMBROBB70", 140.00);
        store.addProduct("260103", "Giga Surf 99 (for Smart subs only) SMGS99", 97.00);
        store.addProduct("260104", "TNT Unlitalk Plus 100 (for TNT subs only) TNTUP100", 105.00);
        store.addProduct("260105", "Willie - UnliTxt 150 (for TNT subs only) TNTWUT150", 134.00);
        store.addProduct("260106", "Mega All-in 250 (for Smart subs only) SMMAI250", 148.00);
        store.addProduct("260107", "Giga Surf 299 (SMBro) SMBROGS299", 177.00);
        store.addProduct("260108", "Giga Surf 299 (for Smart subs only) SMGS299", 145.00);
        store.addProduct("260109", "Giga Surf 799 (for Smart subs only) SMGS799", 241.00);
        store.addProduct("260110", "Video Time 99 (Smart/BRO) SMWVP99", 185.00);
        store.addProduct("260111", "Game Time 50 (Smart) SMWPLAY50", 108.00);
        store.addProduct("260112", "Game Time 100 (Smart) SMWPLAY100", 190.00);
        store.addProduct("260113", "Panalo Data 60 (TNT) TNTWPDATA60", 59.00);
        store.addProduct("260114", "All Out Surf 30 (WEB) NEW! SMWALLIN30", 242.00);
        store.addProduct("260115", "All Out Surf 50 (WEB) NEW! SMWALLIN50", 243.00);
        store.addProduct("260116", "All Out Surf 99 (WEB) NEW! SMWALLIN99", 115.00);
        store.addProduct("260117", "All Text 60 NEW! SMWALT60", 215.00);
        store.addProduct("260118", "Giga Video+ 75 NEW! SMGIGAPLUS75", 166.00);
        store.addProduct("260119", "Giga Video+ 149 NEW! SMGIGAPLUS149", 98.00);
        store.addProduct("260120", "Giga Video+ 449 NEW! SMGIGAPLUS449", 71.00);
        store.addProduct("260121", "Giga Video+ 549 NEW! SMGIGAPLUS549", 151.00);
        store.addProduct("260122", "Giga Video+ 649 NEW! SMGIGAPLUS649", 244.00);
        store.addProduct("260123", "Giga Video 299 NEW! SMGIGA299", 112.00);
        store.addProduct("260124", "Giga Video 399 NEW! SMGIGA399", 98.00);
        store.addProduct("260125", "Giga Video 499 NEW! SMGIGA499", 150.00);
        store.addProduct("260126", "SMARTLoad 20 NEW! SMWP20", 85.00);
        store.addProduct("260127", "SURFMAXPLUS 50 (MI) WEB NEW! SMSURFMPLUS50", 141.00);
        store.addProduct("260128", "SURFMAXPLUS 995 (MI) WEB NEW! SMSURFMPLUS995", 113.00);
        store.addProduct("260129", "Unlitext2All Plus 300 (UAPlus300) NEW! SMUA300", 99.00);
        store.addProduct("260130", "UCT 200 NEW! SMUCT200", 139.00);
        store.addProduct("260131", "UCT 600 NEW! SMUCT600", 164.00);
        store.addProduct("260132", "Unli 50 (WEB) NEW! SMUNLI50", 50.00);
        store.addProduct("260133", "Bro Surfmax Plus 100 NEW! SMBROSMPLUS100", 52.00);
        store.addProduct("260134", "Bro Surfmax Plus 350 NEW! SMBROSMPLUS350", 240.00);
        store.addProduct("260135", "Bro Surfmax Plus 600 NEW! SMBROSMPLUS600", 172.00);
        store.addProduct("260136", "Home Boost 50 (Bro) NEW! SMBROBOOST50", 100.00);
        store.addProduct("260137", "Home Boost 100 (Bro) NEW! SMBROBOOST100", 194.00);
        store.addProduct("260138", "Home Boost 349 (Bro) NEW! SMBROBOOST349", 171.00);
        store.addProduct("260139", "Home Boost 599 (Bro) NEW! SMBROBOOST599", 230.00);
        store.addProduct("260140", "Home Boost 15 (Bro) NEW! SMBROBOOST15", 108.00);
        store.addProduct("260141", "GaanSurf50 NEW! TNTGAANSURF50", 226.00);
        store.addProduct("260142", "Panalo Combo 30 (TNT) NEW! TNTPC30", 81.00);
        store.addProduct("260143", "Unlitext2All Plus 60 (UAPlus60) NEW! TNTUA60", 162.00);
        store.addProduct("260144", "Panalo Data 60 (TNT) NEW! TNTPDATA60", 91.00);
        store.addProduct("260145", "Facebook 50 (TNT) NEW! TNTFACEBOOK50", 93.00);
        store.addProduct("260146", "Giga Video 299 NEW! TNTSPPGIGA299", 184.00);
        store.addProduct("260147", "Giga Video 399 NEW! TNTSPPGIGA399", 103.00);
        store.addProduct("260148", "Giga Video 499 NEW! TNTSPPGIGA499", 68.00);
        store.addProduct("260149", "Surf Saya 20 (TNT) NEW! TNTSAYA20", 148.00);
        store.addProduct("260150", "Surf Saya 30 (TNT) NEW! TNTSAYA30", 226.00);
        store.addProduct("260151", "Surf Saya 99 (TNT) NEW! TNTSAYA99", 135.00);
        store.addProduct("260152", "Surf Saya 199 (TNT) NEW! TNTSAYA199", 114.00);
        store.addProduct("260153", "PLDT Load 30 PLP30", 154.00);
        store.addProduct("260154", "PLDT Load 50 PLP50", 94.00);
        store.addProduct("260155", "PLDT Load 60 PLP60", 144.00);
        store.addProduct("260156", "PLDT Load 100 PLP100", 79.00);
        store.addProduct("260157", "PLDT Load 115 PLP115", 113.00);
        store.addProduct("260158", "PLDT Load 175 PLP175", 196.00);
        store.addProduct("260159", "PLDT Load 200 PLP200", 226.00);
        store.addProduct("260160", "PLDT Load 300 PLP300", 172.00);
        store.addProduct("260161", "PLDT Load 500 PLP500", 211.00);
        store.addProduct("260162", "PLDT Load 1000 PLP1000", 97.00);
        store.addProduct("260163", "CIGNAL Load Plan 450 SD CIGNALSD450", 232.00);
        store.addProduct("260164", "CIGNAL Load Plan 450 HD CIGNAL450", 158.00);
        store.addProduct("260165", "CIGNAL Load Plan 500 HD CIGNAL500", 208.00);
        store.addProduct("260166", "CIGNAL Load Plan 600 HD CIGNAL600", 249.00);
        store.addProduct("260167", "CIGNAL Load Plan 800 HD CIGNAL800", 220.00);
        store.addProduct("260168", "CIGNAL Load Plan 1000 HD CIGNAL1000", 178.00);
        store.addProduct("260169", "Meralco Load 110 ILW110", 168.00);
        store.addProduct("260170", "Meralco Load 220 ILW220", 203.00);
        store.addProduct("260171", "Meralco Load 330 ILW330", 128.00);
        store.addProduct("260172", "Meralco Load 550 ILW550", 141.00);
        store.addProduct("260173", "Meralco Load 1100 ILW1100", 55.00);
        store.addProduct("260174", "Globe Amax Other (P15 - P150) GMXMAX", 81.00);
        store.addProduct("260175", "Globe Amax 10 GMX10", 165.00);
        store.addProduct("260176", "Globe Amax 100 GMX100", 171.00);
        store.addProduct("260177", "Globe Amax 350 (for Globe and TM) GMX350", 153.00);
        store.addProduct("260178", "Globe Amax 450 (for Globe and TM) GMX450", 171.00);
        store.addProduct("260179", "Globe Amax 550 (for Globe and TM) GMX550", 81.00);
        store.addProduct("260180", "Globe Amax 600 (for Globe and TM) GMX600", 125.00);
        store.addProduct("260181", "Globe Amax 700 (for Globe and TM) GMX700", 211.00);
        store.addProduct("260182", "Globe Amax 900 (for Globe and TM) GMX900", 50.00);
        store.addProduct("260183", "Globe GO UNLI 20 GOUNLI20", 113.00);
        store.addProduct("260184", "Globe GO UNLI 25 GOUNLI25", 126.00);
        store.addProduct("260185", "Globe GO UNLI 50 GOUNLI50", 158.00);
        store.addProduct("260186", "Globe & Touch Mobile GoSurf 10 GOSURF10", 177.00);
        store.addProduct("260187", "Globe & Touch Mobile GoSurf 15 GOSURF15", 200.00);
        store.addProduct("260188", "Globe & Touch Mobile GoSurf 50 GOSURF50", 101.00);
        store.addProduct("260189", "Globe GO TIPIDD 30 GOTIPIDD30", 108.00);
        store.addProduct("260190", "Globe GO TIPIDD 100 GOTIPIDD100", 201.00);
        store.addProduct("260191", "Globe & Touch Mobile Super Surf 50 SUPERSURF50", 190.00);
        store.addProduct("260192", "Globe & Touch Mobile Super Surf 120 SUPERSURF120", 101.00);
        store.addProduct("260193", "Globe & Touch Mobile Super Surf 200 SUPERSURF200", 212.00);
        store.addProduct("260194", "Globe GO CALL 30 GOCALL30", 126.00);
        store.addProduct("260195", "Touch Mobile Amax 10 TMX10", 176.00);
        store.addProduct("260196", "Touch Mobile Amax Other (P15 - P150) TMXMAX", 94.00);
        store.addProduct("260197", "Touch Mobile Amax 50 TMX50", 100.00);
        store.addProduct("260198", "Touch Mobile Amax 100 TMX100", 80.00);
        store.addProduct("260199", "Touch Mobile Combo 15 COMBO15", 237.00);
        store.addProduct("260200", "Touch Mobile Combo 20 COMBO20", 70.00);
        store.addProduct("260201", "Touch Mobile Unli Txt 10 (TM & Globe) TXT10", 174.00);
        store.addProduct("260202", "Touch Mobile Unli Txt 10 (all network) UA10", 89.00);
        store.addProduct("260203", "Touch Mobile Astig Txt 20 ASTIGITXT20", 195.00);
        store.addProduct("260204", "Touch Mobile TIPIDD 30 TIPIDD30", 146.00);
        store.addProduct("260205", "Globe GO UNLITXT 15 GOUNLITXT15", 95.00);
        store.addProduct("260206", "Globe GO TXT 20 GOTXT20", 185.00);
        store.addProduct("260207", "Globe GO UNLI 30 (USSD) USSDGOUNLI30", 97.00);
        store.addProduct("260208", "TM COMBO ALL 10 COMBOALL10", 60.00);
        store.addProduct("260209", "TM UNLI CALL 10 UC10", 131.00);
        store.addProduct("260210", "TM CALL & ALL NET TXT 15 CA15", 101.00);
        store.addProduct("260211", "Globe SURF 20 SURF20", 163.00);
        store.addProduct("260212", "Globe GO SURF 30 GOSURF30", 134.00);
        store.addProduct("260213", "Globe GO SURF 299 GOSURF299", 56.00);
        store.addProduct("260214", "Globe GO SURF 999 GOSURF999", 121.00);
        store.addProduct("260215", "Globe GO SURF MB 10 GOSURFMB10", 136.00);
        store.addProduct("260216", "Globe GO SURF MB 15 GOSURFMB15", 173.00);
        store.addProduct("260217", "Globe GO SURF MB 30 GOSURFMB30", 132.00);
        store.addProduct("260218", "Globe GO SURF MB 50 GOSURFMB50", 225.00);
        store.addProduct("260219", "Globe CHAT PLUS 25 CHATPLUS25", 228.00);
        store.addProduct("260220", "Globe GO TIPIDD 100 USSDGOTIPIDD100", 188.00);
        store.addProduct("260221", "Sun Xpressload 10 SNX10", 112.00);
        store.addProduct("260222", "Sun Xpressload 15 SNX15", 215.00);
        store.addProduct("260223", "Sun Xpressload 20 SNX20", 144.00);
        store.addProduct("260224", "Sun Xpressload 25 SNX25", 236.00);
        store.addProduct("260225", "Sun Xpressload 30 SNX30", 83.00);
        store.addProduct("260226", "Sun Xpressload 50 SNX50", 164.00);
        store.addProduct("260227", "Sun Xpressload 75 SNX75", 84.00);
        store.addProduct("260228", "Sun Xpressload 100 SNX100", 70.00);
        store.addProduct("260229", "Sun Xpressload 150 SNX150", 242.00);
        store.addProduct("260230", "Sun Xpressload 300 SNX300", 69.00);
        store.addProduct("260231", "Sun Xpressload 500 SNX500", 144.00);
        store.addProduct("260232", "Sun Xpressload Budgetxt 5 (sell at P7.00); at least) SNXBGT5", 133.00);
        store.addProduct("260233", "Sun Xpressload Budgetxt 20 SNXBGT20", 91.00);
        store.addProduct("260234", "Sun Xpressload Winner Txt 10 SNXWIN10", 106.00);
        store.addProduct("260235", "Sun Xpressload Text Unli 20 SNXTU20", 52.00);
        store.addProduct("260236", "Sun Xpressload Text Unli 50 SNXTU50", 136.00);
        store.addProduct("260237", "Sun Xpressload Text Unli 60 SNXTU60", 111.00);
        store.addProduct("260238", "Sun Xpressload Text Unli 150 SNXTU150", 93.00);
        store.addProduct("260239", "Sun Xpressload Text Unli 200 SNXTU200", 234.00);
        store.addProduct("260240", "Sun Xpressload Text Unli 300 SNXTU300", 123.00);
        store.addProduct("260241", "Sun Xpressload Call & Text Combo 10 SNXCTC10", 54.00);
        store.addProduct("260242", "Sun Xpressload Call & Text Combo 20 SNXCTC20", 226.00);
        store.addProduct("260243", "Sun Xpressload Call & Text Combo 30 SNXCTC30", 175.00);
        store.addProduct("260244", "Sun Xpressload Call & Text Combo 50 SNXCTC50", 110.00);
        store.addProduct("260245", "Sun Call & Text Unlimited 25 SNXCTU25", 125.00);
        store.addProduct("260246", "Sun Xpressload Call & Text Combo 150 SNXCTC150", 118.00);
        store.addProduct("260247", "Sun Xpressload Call & Text Unli 50 SNXCTU50", 125.00);
        store.addProduct("260248", "Sun Xpressload Call & Text Unli 100 SNXCTU100", 125.00);
        store.addProduct("260249", "Sun Xpressload Call & Text Unli 150 SNXCTU150", 187.00);
        store.addProduct("260250", "Sun Xpressload Call & Text Unli 450 SNXCTU450", 63.00);
        store.addProduct("260251", "Sun Xpressload Sulit Calls 30 SNXSULIT30", 139.00);
        store.addProduct("260252", "Sun Xpressload Daylight Call & Text Unli 100 SNXDCTU100", 239.00);
        store.addProduct("260253", "Sun Xpressload IDD Top 10 50 SNXTODOIDD50", 206.00);
        store.addProduct("260254", "Sun Xpressload IDD Top 10 100 SNXTODOIDD100", 100.00);
        store.addProduct("260255", "Sun Xpressload IDD Top 10 300 SNXTODOIDD300", 59.00);
        store.addProduct("260256", "Sun Xpressload Broadband Wireless 50 SNXSBW50", 246.00);
        store.addProduct("260257", "Sun Xpressload Broadband Wireless 100 SNXSBW100", 64.00);
        store.addProduct("260258", "Sun Xpressload Broadband Wireless 250 SNXSBW250", 68.00);
        store.addProduct("260259", "Sun Xpressload Broadband Wireless 300 SNXSBW300", 148.00);
        store.addProduct("260260", "Sun Xpressload Flexi Load 30 SNXFLEXI30", 234.00);
        store.addProduct("260261", "Sun Xpressload Flexi Load 50 SNXFLEXI50", 73.00);
        store.addProduct("260262", "Sun Xpressload Mobile Internet 25 SNXI25", 180.00);
        store.addProduct("260263", "Sun Xpressload Mobile Internet 999 SNXI999", 66.00);
        store.addProduct("260264", "Sun Xpressload Unlimited Mix 25 SNXUMIX25", 81.00);
        store.addProduct("260265", "Sun Xpressload Unlimited Mix 100 SNXUMIX100", 129.00);
        store.addProduct("260266", "Sun Xpressload Text All 15 SNXTEXTALL15", 167.00);
        store.addProduct("260267", "Sun Xpressload UTextAll 20 SNXUTEXTALL20", 173.00);
        store.addProduct("260268", "Sun Xpressload Unli Text Trio 20 SNXUTEXTRIO20", 56.00);
        store.addProduct("260269", "Sun Xpressload Text All Plus 25 SNXTAPLUS25", 158.00);
        store.addProduct("260270", "Sun Xpressload Text All Plus 100 SNXTAPLUS100", 146.00);
        store.addProduct("260271", "Sun Xpressload Call & Text Unli 30 SNXCTU30", 247.00);
        store.addProduct("260272", "Sun Xpressload Todo IDD Combo 30 SNXIDDCOMBO30", 147.00);
        store.addProduct("260273", "Sun Xpressload Trinet 300 SNXTRINET300", 222.00);
        store.addProduct("260274", "Sun Xpressload Nonstop 450 SNXNONSTOP450", 82.00);
        store.addProduct("260275", "SUN Text All 20 NEW! SNXTEXTALL20", 116.00);
        store.addProduct("260276", "Smart Buddy 100 SB100", 83.00);
        store.addProduct("260277", "Smart Buddy 300 SB300", 67.00);
        store.addProduct("260278", "Smart Buddy 500 SB500", 140.00);
        store.addProduct("260279", "Talk N Text 100 TNT100", 53.00);
        store.addProduct("260280", "Talk N Text 300 TNT300", 138.00);
        store.addProduct("260281", "Globe 100 GPH100", 86.00);
        store.addProduct("260282", "Globe 300 GPH300", 184.00);
        store.addProduct("260283", "Globe 500 GPH500", 154.00);
        store.addProduct("260284", "Touch Mobile 50 TM50", 65.00);
        store.addProduct("260285", "Touch Mobile 100 TM100", 217.00);
        store.addProduct("260286", "Touch Mobile 300 TM300", 153.00);
        store.addProduct("260287", "Razer Gold 20 (prev. MOLPoints) NEW! Razer20", 181.00);
        store.addProduct("260288", "Razer Gold 50 (prev. MOLPoints) NEW! Razer50", 164.00);
        store.addProduct("260289", "Razer Gold 100 (prev. MOLPoints) NEW! Razer100", 209.00);
        store.addProduct("260290", "Razer Gold 150 (prev. MOLPoints) NEW! Razer150", 160.00);
        store.addProduct("260291", "Razer Gold 250 (prev. MOLPoints) NEW! Razer250", 77.00);
        store.addProduct("260292", "Razer Gold 300 (prev. MOLPoints) NEW! Razer300", 214.00);
        store.addProduct("260293", "Razer Gold 500 (prev. MOLPoints) NEW! Razer500", 177.00);
        store.addProduct("260294", "Razer Gold 1000 (prev. MOLPoints) NEW! Razer1000", 230.00);
        store.addProduct("260295", "Razer Gold 2000 (prev. MOLPoints) NEW! Razer2000", 129.00);
        store.addProduct("260296", "Razer Gold 5000 (prev. MOLPoints) NEW! Razer5000", 119.00);
        store.addProduct("260297", "Ragnarok Online Mobile P20 ROM20", 107.00);
        store.addProduct("260298", "Ragnarok Online Mobile P50 ROM50", 243.00);
        store.addProduct("260299", "Ragnarok Online Mobile P100 ROM100", 231.00);
        store.addProduct("260300", "Ragnarok Online Mobile P300 ROM300", 237.00);
        store.addProduct("260301", "Ragnarok Online Mobile P500 ROM500", 250.00);
        store.addProduct("260302", "Ragnarok Online Mobile P1000 ROM1000", 101.00);
        store.addProduct("260303", "Ragnarok Online Mobile P5000 ROM5000", 58.00);
        store.addProduct("260304", "Rules of Survival P20 NEW! ROS20", 158.00);
        store.addProduct("260305", "Rules of Survival P50 NEW! ROS50", 220.00);
        store.addProduct("260306", "Rules of Survival P100 NEW! ROS100", 186.00);
        store.addProduct("260307", "Rules of Survival P300 NEW! ROS300", 115.00);
        store.addProduct("260308", "Rules of Survival P500 NEW! ROS500", 249.00);
        store.addProduct("260309", "Rules of Survival P1000 NEW! ROS1000", 141.00);
        store.addProduct("260310", "PUBG Mobile P20 PUBGM20", 140.00);
        store.addProduct("260311", "PUBG Mobile P50 PUBGM50", 212.00);
        store.addProduct("260312", "PUBG Mobile P100 PUBGM100", 192.00);
        store.addProduct("260313", "PUBG Mobile P300 PUBGM300", 73.00);
        store.addProduct("260314", "PUBG Mobile P500 PUBGM500", 101.00);
        store.addProduct("260315", "PUBG Mobile P1000 PUBGM1000", 180.00);
        store.addProduct("260316", "Blizzard Battle.net Balance 275 (5 USD) BLIZZARD275", 92.00);
        store.addProduct("260317", "Blizzard Battle.net Balance 550 (10 USD) BLIZZARD550", 180.00);
        store.addProduct("260318", "Blizzard Battle.net Balance 1100 (20 USD) BLIZZARD1100", 103.00);
        store.addProduct("260319", "Dragon Nest M SEA P20 (Razer Gold) NEW! DNM20", 234.00);
        store.addProduct("260320", "Dragon Nest M SEA P50 (Razer Gold) NEW! DNM50", 85.00);
        store.addProduct("260321", "Dragon Nest M SEA P100 (Razer Gold) NEW! DNM100", 142.00);
        store.addProduct("260322", "Dragon Nest M SEA P300 (Razer Gold) NEW! DNM300", 200.00);
        store.addProduct("260323", "Dragon Nest M SEA P500 (Razer Gold) NEW! DNM500", 75.00);
        store.addProduct("260324", "Dragon Nest M SEA P1000 (Razer Gold) NEW! DNM1000", 212.00);
        store.addProduct("260325", "Dragon Nest M SEA P2000 (Razer Gold) NEW! DNM2000", 130.00);
        store.addProduct("260326", "Dragon Nest M SEA P5000 (Razer Gold) NEW! DNM5000", 57.00);
        store.addProduct("260327", "BIGO Live P20 (Razer Gold) NEW! BIGO20", 200.00);
        store.addProduct("260328", "BIGO Live P50 (Razer Gold) NEW! BIGO50", 169.00);
        store.addProduct("260329", "BIGO Live P100 (Razer Gold) NEW! BIGO100", 114.00);
        store.addProduct("260330", "BIGO Live P300 (Razer Gold) NEW! BIGO300", 57.00);
        store.addProduct("260331", "BIGO Live P500 NEW! BIGO500", 166.00);
        store.addProduct("260332", "BIGO Live P1000 NEW! BIGO1000", 223.00);
        store.addProduct("260333", "War of Rings P20 (zGold-MOLPoints) NEW! WOR20", 134.00);
        store.addProduct("260334", "War of Rings P50 (zGold-MOLPoints) NEW! WOR50", 201.00);
        store.addProduct("260335", "War of Rings P100 (zGold-MOLPoints) NEW! WOR100", 80.00);
        store.addProduct("260336", "War of Rings P300 (zGold-MOLPoints) NEW! WOR300", 143.00);
        store.addProduct("260337", "War of Rings P500 (zGold-MOLPoints) NEW! WOR500", 154.00);
        store.addProduct("260338", "War of Rings P1000 (zGold-MOLPoints) NEW! WOR1000", 149.00);
        store.addProduct("260339", "Rohan Online - Playwith P20 (zGold-MOLPoints) NEW! RHN20", 72.00);
        store.addProduct("260340", "Rohan Online - Playwith P50 (zGold-MOLPoints) NEW! RHN50", 165.00);
        store.addProduct("260341", "Rohan Online - Playwith P100 (zGold-MOLPoints) NEW! RHN100", 125.00);
        store.addProduct("260342", "Rohan Online - Playwith P300 (zGold-MOLPoints) NEW! RHN300", 115.00);
        store.addProduct("260343", "Rohan Online - Playwith P500 (zGold-MOLPoints) NEW! RHN500", 250.00);
        store.addProduct("260344", "Rohan Online - Playwith P1000 (zGold-MOLPoints) NEW! RHN1000", 76.00);
        store.addProduct("260345", "Warpportal PH 50 (100 Points Ragnarok Journey, Dragon Saga Philippines) NEW! WPPH50", 185.00);
        store.addProduct("260346", "Warpportal PH 100 (200 Points Ragnarok Journey, Dragon Saga Philippines) NEW! WPPH100", 153.00);
        store.addProduct("260347", "Warpportal PH 250 (500 Points Ragnarok Journey, Dragon Saga Philippines) NEW! WPPH250", 177.00);
        store.addProduct("260348", "Warpportal PH 500 (1k Points Ragnarok Journey, Dragon Saga Philippines) NEW! WPPH500", 248.00);
        store.addProduct("260349", "Warpportal PH 750 (1.5 Points Ragnarok Journey, Dragon Saga Philippines) NEW! WPPH750", 191.00);
        store.addProduct("260350", "Warpportal PH 1000 (2k Points Ragnarok Journey, Dragon Saga Philippines) NEW! WPPH1000", 105.00);
        store.addProduct("260351", "Warpportal PH 1500 (3k Points Ragnarok Journey, Dragon Saga Philippines) NEW! WPPH1500", 88.00);
        store.addProduct("260352", "Warpportal PH 2500 (5k Points Ragnarok Journey, Dragon Saga Philippines) NEW! WPPH2500", 130.00);
        store.addProduct("260353", "Mobile Legends P20 (zGold-MOLPoints) NEW! MLBB20", 75.00);
        store.addProduct("260354", "Mobile Legends P50 (zGold-MOLPoints) NEW! MLBB50", 169.00);
        store.addProduct("260355", "Mobile Legends P100 (zGold-MOLPoints) NEW! MLBB100", 126.00);
        store.addProduct("260356", "Mobile Legends P300 (zGold-MOLPoints) NEW! MLBB300", 147.00);
        store.addProduct("260357", "Mobile Legends P500 (zGold-MOLPoints) NEW! MLBB500", 87.00);
        store.addProduct("260358", "Mobile Legends P1000 (zGold-MOLPoints) NEW! MLBB1000", 231.00);
        store.addProduct("260359", "STEAM WALLET CODE 65 (equiv to Steam Wallet PHP50) STEAM65", 56.00);
        store.addProduct("260360", "STEAM WALLET CODE 130 (equiv Steam Wallet PHP100) STEAM130", 126.00);
        store.addProduct("260361", "STEAM WALLET CODE 325 (equiv Steam Wallet PHP250) STEAM325", 88.00);
        store.addProduct("260362", "STEAM WALLET CODE 645 (equiv Steam Wallet PHP500) STEAM645", 249.00);
        store.addProduct("260363", "STEAM WALLET CODE 1025 (equiv Steam Wallet PHP800) STEAM1025", 71.00);
        store.addProduct("260364", "STEAM WALLET CODE 1285 (equiv Steam Wallet PHP1000 STEAM1285", 71.00);
        store.addProduct("260365", "STEAM WALLET CODE 2820 (equiv Steam Wallet PHP2200 STEAM2820", 162.00);
        store.addProduct("260366", "Garena 10 (10 Shells) GM10", 150.00);
        store.addProduct("260367", "Garena 20 (20 Shells) GM20", 176.00);
        store.addProduct("260368", "Garena 50 (50 Shells) GM50", 137.00);
        store.addProduct("260369", "Garena 100 (100 Shells) GM100", 113.00);
        store.addProduct("260370", "Garena 200 (200 Shells) GM200", 63.00);
        store.addProduct("260371", "Garena 300 (300 Shells) GM300", 142.00);
        store.addProduct("260372", "Garena 500 (500 Shells) GM500", 52.00);
        store.addProduct("260373", "Garena 1000 (1000 Shells) GM1000", 219.00);
        store.addProduct("260374", "EX Cash 20 (for Ragnarok Philippines) EXCASH20", 117.00);
        store.addProduct("260375", "EX Cash 50 (for Ragnarok Philippines) EXCASH50", 108.00);
        store.addProduct("260376", "EX Cash 100 (for Ragnarok Philippines) EXCASH100", 241.00);
        store.addProduct("260377", "EX Cash 300 (for Ragnarok Philippines) EXCASH300", 243.00);
        store.addProduct("260378", "EX Cash 500 (for Ragnarok Philippines) EXCASH500", 87.00);
        store.addProduct("260379", "EX Cash 1000 (for Ragnarok Philippines) EXCASH1000", 239.00);
        store.addProduct("260380", "CHERRY CREDITS 210 (5000 CC) CC210", 50.00);
        store.addProduct("260381", "CHERRY CREDITS 420 (10000 CC) CC420", 76.00);
        store.addProduct("260382", "CHERRY CREDITS 1260 (30000 CC) CC1260", 146.00);
        store.addProduct("260383", "CHERRY CREDITS 2100 (50000 CC) CC2100", 118.00);
        store.addProduct("260384", "CHERRY CREDITS 4200 (100000 CC) CC4200", 114.00);
        store.addProduct("260385", "R-COIN PHP20 (4 R-Coins) RCOIN20", 79.00);
        store.addProduct("260386", "R-COIN PHP50 (10 R-Coins) RCOIN50", 174.00);
        store.addProduct("260387", "R-COIN PHP80 (16 R-Coins) RCOIN80", 79.00);
        store.addProduct("260388", "R-COIN PHP105 (21 R-Coins) RCOIN105", 199.00);
        store.addProduct("260389", "R-COIN PHP315 (63 + 3 R-Coins) RCOIN315", 202.00);
        store.addProduct("260390", "R-COIN PHP370 (74 + 4 R-Coins) RCOIN370", 119.00);
        store.addProduct("260391", "R-COIN PHP525 (105 + 6 R-Coins) RCOIN525", 207.00);
        store.addProduct("260392", "R-COIN PHP1050 (210 + 16 R-Coins) RCOIN1050", 208.00);
        store.addProduct("260393", "R-COIN PHP2100 (420 + 40 R-Coins) RCOIN2100", 50.00);
        store.addProduct("260394", "Triplejack 300 (Equivalent to 8,220 Jacks) JACKS300", 206.00);
        store.addProduct("260395", "Triplejack 1500 (Equivalent to 41,095 Jacks) JACKS1500", 232.00);
        store.addProduct("260396", "Triplejack 2750 (Equivalent to 75,340 Jacks) JACKS2750", 154.00);
        store.addProduct("260397", "Wintyme 20 (20 Credits) NEW! Wintyme20", 85.00);
        store.addProduct("260398", "Wintyme 50 (50 Credits) NEW! Wintyme50", 248.00);
        store.addProduct("260399", "Wintyme 100 (100 Credits) NEW! Wintyme100", 65.00);
        store.addProduct("260400", "LevelUp 20 (for all LevelUp games) LVLUP20", 156.00);
        store.addProduct("260401", "LevelUp 50 (for all LevelUp games) LVLUP50", 90.00);
        store.addProduct("260402", "LevelUp 75 (for all LevelUp games) LVLUP75", 54.00);
        store.addProduct("260403", "LevelUp 100 (for all LevelUp games) LVLUP100", 203.00);
        store.addProduct("260404", "LevelUp 300 (for all LevelUp games) LVLUP300", 61.00);
        store.addProduct("260405", "LevelUp 350 (for all LevelUp games) LVLUP350", 124.00);
        store.addProduct("260406", "LevelUp 500 (for all LevelUp games) LVLUP500", 125.00);
        store.addProduct("260407", "LevelUp 1000 (for all LevelUp games) LVLUP1000", 208.00);
        store.addProduct("260408", "LevelUp 2000 (for all LevelUp games) LVLUP2000", 60.00);
        store.addProduct("260409", "Game Club 20 (for CF,WOW,iDate,Dragona) GC20", 223.00);
        store.addProduct("260410", "Game Club 50 (for CF,WOW,iDate,Dragona) GC50", 108.00);
        store.addProduct("260411", "Game Club 100 (for CF,WOW,iDate,Dragona) GC100", 239.00);
        store.addProduct("260412", "Game Club 200 (for CF,WOW,iDate,Dragona) GC200", 244.00);
        store.addProduct("260413", "Game Club 300 (for CF,WOW,iDate,Dragona) GC300", 225.00);
        store.addProduct("260414", "Game Club 400 (for CF,WOW,iDate,Dragona) GC400", 184.00);
        store.addProduct("260415", "Game Club 500 (for CF,WOW,iDate,Dragona) GC500", 59.00);
        store.addProduct("260416", "Game Club 1000 (for CF,WOW,iDate,Dragona) GC1000", 202.00);
        store.addProduct("260417", "Softnyx 50 (for Gun Bound, Rakion, Wolf Team) SOFTNYX50", 185.00);
        store.addProduct("260418", "Softnyx 100 (for Gun Bound, Rakion, Wolf Team) SOFTNYX100", 113.00);
        store.addProduct("260419", "Softnyx 300 (for Gun Bound, Rakion, Wolf Team) SOFTNYX300", 103.00);
        store.addProduct("260420", "Softnyx 500 (for Gun Bound, Rakion, Wolf Team) SOFTNYX500", 95.00);
        store.addProduct("260421", "GAMEYEZ 100 (equivalent to 200 Points) GEP100", 129.00);
        store.addProduct("260422", "GAMEYEZ 500 (equivalent to 600 Points) GEP300", 249.00);
        store.addProduct("260423", "GAMEYEZ 300 (equivalent to 1000 Points) GEP500", 163.00);
        store.addProduct("260424", "SNSPLUS 20 (Soul of Summoners) SNSPLUS20", 232.00);
        store.addProduct("260425", "SNSPLUS 100 (Soul of Summoners) SNSPLUS100", 149.00);
        store.addProduct("260426", "SNSPLUS 300 (Soul of Summoners) SNSPLUS300", 75.00);
        store.addProduct("260427", "SNSPLUS 500 (Soul of Summoners) SNSPLUS500", 160.00);
        store.addProduct("260428", "SNSPLUS 1000 (Soul of Summoners) SNSPLUS1000", 206.00);
        store.addProduct("260429", "WarpPortal 220 (RO1,RO2,Requiem,Rose,Dragon Saga) WP220", 110.00);
        store.addProduct("260430", "WarpPortal 440 (RO1,RO2,Requiem,Rose,Dragon Saga) WP440", 181.00);
        store.addProduct("260431", "WarpPortal 660 (RO1,RO2,Requiem,Rose,Dragon Saga) WP660", 244.00);
        store.addProduct("260432", "WarpPortal 880 (RO1,RO2,Requiem,Rose,Dragon Saga) WP880", 169.00);

        store.addProduct("260433", "WarpPortal 1320 (RO1,RO2,Requiem,Rose,Dragon Saga) WP1320", 82.00);
        store.addProduct("260434", "WarpPortal 2200 (RO1,RO2,Requiem,Rose,Dragon Saga) WP2200", 217.00);
        store.addProduct("260435", "Lead Hope 20 (for KUF2, War Rock & Andarasa) LEADHOPE20", 131.00);
        store.addProduct("260436", "Lead Hope 50 (for KUF2, War Rock & Andarasa) LEADHOPE50", 66.00);
        store.addProduct("260437", "Lead Hope 100 (for KUF2, War Rock & Andarasa) LEADHOPE100", 188.00);
        store.addProduct("260438", "Lead Hope 300 (for KUF2, War Rock & Andarasa) LEADHOPE300", 188.00);
        store.addProduct("260439", "Lead Hope 500 (for KUF2, War Rock & Andarasa) LEADHOPE500", 106.00);
        store.addProduct("260440", "Lead Hope 1000 (for KUF2, War Rock & Andarasa) LEADHOPE1000", 170.00);
        store.addProduct("260441", "SWEEPO 100 (equivalent to 5 days AutoPlay) SWEEPO100", 245.00);
        store.addProduct("260442", "SWEEPO 500 (equivalent to 30 days AutoPlay) SWEEPO500", 60.00);
        store.addProduct("260443", "SWEEPO 1000 (equivalent to 75 days AutoPlay) SWEEPO1000", 63.00);
        store.addProduct("260444", "Pusoy Pinoy 50 - the Beginner Pack (1.5 M Gold) PUSOY50", 194.00);
        store.addProduct("260445", "Pusoy Pinoy 100 - the Bronze Pack (3.15M Gold) PUSOY100", 173.00);
        store.addProduct("260446", "Pusoy Pinoy 250 - the Silver Pack (8.25 M Gold) PUSOY250", 155.00);
        store.addProduct("260447", "Pusoy Pinoy 500 - the Gold Pack (17.250 M Gold) PUSOY500", 152.00);
        store.addProduct("260448", "Pusoy Pinoy 1000 - the Platinum Pack (36M Gold) PUSOY1000", 63.00);
        store.addProduct("260449", "Pusoy Pinoy 2500 - the Diamond Pack (93.750M Gold) PUSOY2500", 152.00);
        store.addProduct("260450", "Tongits Wars 25 (50 Gold) TWGOLD25", 243.00);
        store.addProduct("260451", "Tongits Wars 50 (150 Gold) TWGOLD50", 163.00);
        store.addProduct("260452", "Tongits Wars 60 (250 Gold) TWGOLD60", 134.00);
        store.addProduct("260453", "Tongits Wars 100 (500 Gold) TWGOLD100", 118.00);
        store.addProduct("260454", "Tongits Wars 200 (1250 Gold) TWGOLD200", 139.00);
        store.addProduct("260455", "uCoins P49 - 60K uCoins (Social & Ultimate Tongits, Lucky 8) NEW! UCOINS49", 203.00);
        store.addProduct("260456", "uCoins P249 - 330K uCoins (Social & Ultimate Tongits, Lucky 8) NEW! UCOINS249", 138.00);
        store.addProduct("260457", "uCoins P499 - 1.35M uCoins (Social & Ultimate Tongits, Lucky 8) NEW! UCOINS499", 180.00);
        store.addProduct("260458", "uCoins P999 - 3M uCoins (Social & Ultimate Tongits, Lucky 8) NEW! UCOINS999", 149.00);
        store.addProduct("260459", "uCoins P1,999 - 12M uCoins (Social & Ultimate Tongits, Lucky 8) NEW! UCOINS1999", 134.00);
        store.addProduct("260460", "uCoins P4,999 - 36M uCoins (Social & Ultimate Tongits, Lucky 8) NEW! UCOINS4999", 230.00);
        store.addProduct("260461", "ZGM23 ZGM23", 204.00);
        store.addProduct("260462", "ZGM56 ZGM56", 74.00);
        store.addProduct("260463", "ZGM112 ZGM112", 97.00);
        store.addProduct("260464", "ZGM168 ZGM168", 98.00);
        store.addProduct("260465", "ZGM280 ZGM280", 206.00);
        store.addProduct("260466", "ZGM336 ZGM336", 59.00);
        store.addProduct("260467", "ZGM560 ZGM560", 230.00);
        store.addProduct("260468", "ZGM1120 ZGM1120", 98.00);
        store.addProduct("260469", "ZGM2240 ZGM2240", 155.00);
        store.addProduct("260470", "Marino PhonePal 300 Marino300", 114.00);
        store.addProduct("260471", "Marino PhonePal 500 Marino500", 67.00);
        store.addProduct("260472", "Marino Textmate 100 MarinoTxt100", 72.00);
        store.addProduct("260473", "GPinoy 99 GPinoy99", 171.00);
        store.addProduct("260474", "GSAT200 GSAT200", 247.00);
        store.addProduct("260475", "GSAT 300 GSAT300", 198.00);
        store.addProduct("260476", "GSAT 500 GSAT500", 188.00);
        store.addProduct("260477", "CIGNAL RELOAD CARD 200 CRC200", 101.00);
        store.addProduct("260478", "CIGNAL RELOAD CARD 300 CRC300", 85.00);
        store.addProduct("260479", "CIGNAL RELOAD CARD 450 CRC450", 55.00);
        store.addProduct("260480", "CIGNAL RELOAD CARD 500 CRC500", 64.00);
        store.addProduct("260481", "CIGNAL RELOAD CARD 600 CRC600", 56.00);
        store.addProduct("260482", "CIGNAL RELOAD CARD 800 CRC800", 113.00);
        store.addProduct("260483", "CIGNAL RELOAD CARD 1000 CRC1000", 134.00);
        store.addProduct("260484", "SkyPrepaid 99 valid for 30 days SKY99", 197.00);
        store.addProduct("260485", "SkyPrepaid 150 valid for 30 days NEW! SKY150", 139.00);
        store.addProduct("260486", "SkyPrepaid 250 valid for 30 days SKY250", 50.00);
        store.addProduct("260487", "SkyPrepaid 450 valid for 30 days SKY450", 103.00);
        store.addProduct("260488", "WTFAST 500 (1 Month Subscription Service) NEW! WTFAST500", 174.00);
        store.addProduct("260489", "WTFAST 1425 (3 Months Subscription Service) NEW! WTFAST1425", 248.00);
        store.addProduct("260490", "WTFAST 2700 (6 Months Subscription Service) NEW! WTFAST2700", 229.00);
        store.addProduct("260491", "WTFAST 4995 (12 Months Subscription Service) NEW! WTFAST4995", 225.00);
        store.addProduct("260492", "VIU 99 (1 month Subscription) NEW! VIU99", 61.00);
        store.addProduct("260493", "IFLIX129 (30 days of iflix Playtime) IFLIX129", 242.00);
        store.addProduct("260494", "PHP 20 migCredits/migCoins MIGME20", 210.00);
        store.addProduct("260495", "PHP 50 migCredits/migCoins MIGME50", 204.00);
        store.addProduct("260496", "PHP 100 migCredits/migCoins MIGME100", 212.00);
        store.addProduct("260497", "PHP 200 migCredits/migCoins MIGME200", 187.00);
        store.addProduct("260498", "PHP 300 migCredits/migCoins MIGME300", 83.00);
        store.addProduct("260499", "PHP 500 migCredits/migCoins MIGME500", 85.00);
        store.addProduct("260500", "PLDT Budget Card 100 PBC100", 157.00);
        store.addProduct("260501", "PLDT Budget Card 200 PBC200", 52.00);
        store.addProduct("260502", "ESET 250 (1 yr Mobile Security v3) ESET250", 124.00);
        store.addProduct("260503", "ESET 650 (1 yr PC NOD32 Anti Virus) ESET650", 219.00);
        store.addProduct("260504", "ESET 850 (1 yr Internet Security) ESET850", 139.00);
        store.addProduct("260505", "ESET CS 850 (1-yr Cyber Security Pro for Mac) ESETCS850", 218.00);
        store.addProduct("260506", "LoadCentral Test ePIN ZTEST1", 100.00);


        boolean quit = false;
        while (!quit) {
            choices();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    lookupPrice();
                    break;
                case 2:
                    buyProduct();
                    break;
                case 3:
                    listProducts();
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }


    }

    public static void choices() {
        System.out.println("1)\t Check Price");
        System.out.println("2)\t Make Purchase");
        System.out.println("3)\t List Products");
        System.out.println("4\t Quit");

    }


    public static void listProducts() {

        boolean goback = false;
        productChoices();
        System.out.println("Please select from the following options");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                ArrayList<Store.Product> priceList = new ArrayList<>(store.getProductList());
                Collections.sort(priceList, Store.PRICE_COMPARISON);
                printListwithMoney(priceList);
                break;
            case 2:
                ArrayList<Store.Product> productList = new ArrayList(store.getProductList());
                printList(productList);
                break;
            case 3:
                //Collections.sort
                break;
            case 4:
                mainMenu();
                break;
        }

    }


    public static void buyProduct() {
        System.out.println("Please enter item you'd like to purchase");
        String code = scanner.next();
        store.purchase(code);

    }

    public static void lookupPrice() {
        boolean end = false;
        while (!end) {
            System.out.println("Please enter product code of item you would like to look up");
            System.out.println("Type 'end' to back to main menu");
            String productNumber = scanner.next();
            if (productNumber.equals("end") || productNumber.equals("End")) {
                end = true;
            } else {
                System.out.println(store.productSearch(productNumber));
            }


        }
    }


    public static void printList(List<Store.Product> list) {
        for (Store.Product product : list) {
            System.out.println(product.toString());
        }

        System.out.println();
        System.out.println("===================================================");
    }

    public static void printListwithMoney(List<Store.Product> list) {
        System.out.println("With dollar values");
        System.out.println();
        for (Store.Product product : list) {
            System.out.println(" " + product.getProductCode() + " - $" + product.getPrice());
        }

        System.out.println();
        System.out.println("===================================================");

    }

    public static void printListwithTitles(List<Store.Product> list) {
        System.out.println("With dollar values");
        System.out.println();
        for (Store.Product product : list) {
            System.out.println(" " + product.getName() + " - $" + product.getProductCode());
        }

        System.out.println();
        System.out.println("===================================================");
    }


    public static void productChoices() {
        System.out.println("1)\t Organize by Price");
        System.out.println("2)\t Organize by Product Code");
        System.out.println("3)\t Organize by Product Description");
        System.out.println("4)\t Go Back");

    }

    public static void mainMenu() {


    }


}
