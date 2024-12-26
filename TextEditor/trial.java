/* 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.io.*;
import java.util.Collections;
import java.util.List;

 class Tools {
    Scanner sc = new Scanner(System.in);

    public void view(ArrayList<String> words){
        for (String st : words) {
            System.out.print(st+" ");
        }  
    }

    public void find(ArrayList<String> words) throws Exception {
        System.out.print("Enter word to Find : ");
        String searchWord = sc.next();
        for (String st : words) {
            if(st.equals(searchWord)){
                st="\u001B[31m" + st + "\u001B[0m";
            }
            System.out.print(st+" ");
        }
        //view(words);
        /* for (String st : words) {
            if(st.equals(searchWord)){
                st="\u001B[0m" + searchWord + "\u001B[0m";
            }
        }  
    }

    public void replace(ArrayList<String> words) throws Exception {
        System.out.print("Enter word to Find : ");
        String searchWord = sc.next();
        System.out.print("Enter word to Replace with : ");
        String replaceWord = sc.next();
        Iterator<String> iterator = words.iterator();
        int index=-1;
        while (iterator.hasNext()) {
            index++;
            if (iterator.next().equals(searchWord)) {
                words.set(index,replaceWord); 
            }
        }
        view(words);
    }

    public void spellCheck(ArrayList<String> words){
        Set<String> dict=new HashSet<>();
        dict.addAll(Arrays.asList("a"," about"," above"," across"," act"," active"," activity"," add"," afraid"," after"," again"," age"," ago"," agree"," air"," all"," alone"," along"," already"," always"," am"," amount"," an"," and"," angry"," another"," answer"," any"," anyone"," anything"," anytime"," appear"," apple"," are"," area"," arm"," army"," around"," arrive"," art"," as"," ask"," at"," attack"," aunt"," autumn"," away","baby"," base"," back"," bad"," bag"," ball"," bank"," basket"," bath"," be"," bean"," bear"," beautiful"," beer"," bed"," bedroom"," behave"," before"," begin"," behind"," bell"," below"," besides"," best"," better"," between"," big"," bird"," birth"," birthday"," bit"," bite"," black"," bleed"," block"," blood"," blow"," blue"," board"," boat"," body"," boil"," bone"," book"," border"," born"," borrow"," both"," bottle"," bottom"," bowl"," box"," boy"," branch"," brave"," bread"," break"," breakfast"," breathe"," bridge"," bright"," bring"," brother"," brown"," brush"," build"," burn"," business"," bus"," busy"," but"," buy"," by","cake"," call"," can"," candle"," cap"," car"," card"," care"," careful"," careless"," carry"," case"," cat"," catch"," central"," century"," certain"," chair"," chance"," change"," chase"," cheap"," cheese"," chicken"," child"," children"," chocolate"," choice"," choose"," circle"," city"," class"," clever"," clean"," clear"," climb"," clock"," cloth"," clothes"," cloud"," cloudy"," close"," coffee"," coat"," coin"," cold"," collect"," colour"," comb"," comfortable"," common"," compare"," come"," complete"," computer"," condition"," continue"," control"," cook"," cool"," copper"," corn"," corner"," correct"," cost"," contain"," count"," country"," course"," cover"," crash"," cross"," cry"," cup"," cupboard"," cut","dance"," dangerous"," dark"," daughter"," day"," dead"," decide"," decrease"," deep"," deer"," depend"," desk"," destroy"," develop"," die"," different"," difficult"," dinner"," direction"," dirty"," discover"," dish"," direction"," do"," dog"," door"," double"," down"," draw"," dream"," dress"," drink"," drive"," drop"," dry"," duck"," dust"," duty"," each"," ear"," early"," earn"," earth"," east"," easy"," eat"," education"," effect"," egg"," eight"," either"," electric"," elephant"," else"," empty"," end"," enemy"," enjoy"," enough"," enter"," equal"," entrance"," escape"," even"," evening"," event"," ever"," every"," everyone"," exact"," everybody"," examination"," example"," except"," excited"," exercise"," expect"," expensive"," explain"," extremely"," eye","face"," fact"," fail"," fall"," false"," family"," famous"," far"," farm"," father"," fast"," fat"," fault"," fear"," feed"," feel"," female"," fever"," few"," fight"," fill"," film"," find"," fine"," finger"," finish"," fire"," first"," fit"," five"," fix"," flag"," flat"," float"," floor"," flour"," flower"," fly"," fold"," food"," fool"," foot"," football"," for"," force"," foreign"," forest"," forget"," forgive"," fork"," form"," fox"," four"," free"," freedom"," freeze"," fresh"," friend"," friendly"," from"," front"," fruit"," full"," fun"," funny"," furniture"," further"," future"," game"," garden"," gate"," general"," gentleman"," get"," gift"," give"," glad"," glass"," go"," goat"," god"," gold"," good"," goodbye"," grandfather"," grandmother"," grass"," grave"," great"," green"," grey"," ground"," group"," grow"," gun"," hair"," half"," hall"," hammer"," hand"," happen"," happy"," hard"," hat"," hate"," have"," he"," head"," healthy"," hear"," heavy"," hello"," help"," heart"," heaven"," height"," help"," hen"," her"," here"," hers"," hide"," high"," hill"," him"," his"," hit"," hobby"," hold"," hole"," holiday"," home"," hope"," horse"," hospital"," hot"," hotel"," house"," how"," hundred"," hungry"," hour"," hurry"," husband"," hurt"," I"," ice"," idea"," if"," important"," in"," increase"," inside"," into"," introduce"," invent"," iron"," invite"," is"," island"," it"," its","jelly"," job"," join"," juice"," jump"," just"," keep"," key"," kill"," kind"," king"," kitchen"," knee"," knife"," knock"," know"," ladder"," lady"," lamp"," land"," large"," last"," late"," lately"," laugh"," lazy"," lead"," leaf"," learn"," leave"," leg"," left"," lend"," length"," less"," lesson"," let"," letter"," library"," lie"," life"," light"," like"," lion"," lip"," list"," listen"," little"," live"," lock"," lonely"," long"," look"," lose"," lot"," love"," low"," lower"," luck"," machine"," main"," make"," male"," man"," many"," map"," mark"," market"," marry"," matter"," may"," me"," meal"," mean"," measure"," meat"," medicine"," meet"," member"," mention"," method"," middle"," milk"," million"," mind"," minute"," miss"," mistake"," mix"," model"," modern"," moment"," money"," monkey"," month"," moon"," more"," morning"," most"," mother"," mountain"," mouth"," move"," much"," music"," must"," my"," name"," narrow"," nation"," nature"," near"," nearly"," neck"," need"," needle"," neighbour"," neither"," net"," never"," new"," news"," newspaper"," next"," nice"," night"," nine"," no"," noble"," noise"," none"," nor"," north"," nose"," not"," nothing"," notice"," now"," number"," obey"," object"," ocean"," of"," off"," offer"," office"," often"," oil"," old"," on"," one"," only"," open"," opposite"," or"," orange"," order"," other"," our"," out"," outside"," over"," own"," page"," pain"," paint"," pair"," pan"," paper"," parent"," park"," part"," partner"," party"," pass"," past"," path"," pay"," peace"," pen"," pencil"," people"," pepper"," per"," perfect"," period"," person"," petrol"," photograph"," piano"," pick"," picture"," piece"," pig"," pin"," pink"," place"," plane"," plant"," plastic"," plate"," play"," please"," pleased"," plenty"," pocket"," point"," poison"," police"," polite"," pool"," poor"," popular"," position"," possible"," potato"," pour"," power"," present"," press"," pretty"," prevent"," price"," prince"," prison"," private"," prize"," probably"," problem"," produce"," promise"," proper"," protect"," provide"," public"," pull"," punish"," pupil"," push"," put"," queen"," question"," quick"," quiet"," quite","radio"," rain"," rainy"," raise"," reach"," read"," ready"," real"," really"," receive"," record"," red"," remember"," remind"," remove"," rent"," repair"," repeat"," reply"," report"," rest"," restaurant"," result"," return"," rice"," rich"," ride"," right"," ring"," rise"," road"," rob"," rock"," room"," round"," rubber"," rude"," rule"," ruler"," run"," rush","sad"," safe"," sail"," salt"," same"," sand"," save"," say"," school"," science"," scissors"," search"," seat"," second"," see"," seem"," sell"," send"," sentence"," serve"," seven"," several"," sex"," shade"," shadow"," shake"," shape"," share"," sharp"," she"," sheep"," sheet"," shelf"," shine"," ship"," shirt"," shoe"," shoot"," shop"," short"," should"," shoulder"," shout"," show"," sick"," side"," signal"," silence"," silly"," silver"," similar"," simple"," single"," since"," sing"," sink"," sister"," sit"," six"," size"," skill"," skin"," skirt"," sky"," sleep"," slip"," slow"," smoke"," small"," smell"," smile"," smoke"," snow"," so"," soap"," sock"," soft"," some"," someone"," something"," sometimes"," son"," soon"," sorry"," sound"," soup"," south"," space"," speak"," special"," speed"," spell"," spend"," spoon"," sport"," spread"," spring"," square"," stamp"," stand"," star"," start"," station"," stay"," steal"," steam"," step"," still"," stomach"," stone"," stop"," store"," storm"," story"," strange"," street"," strong"," structure"," student"," study"," stupid"," subject"," substance"," successful"," such"," sudden"," sugar"," suitable"," summer"," sun"," sunny"," support"," sure"," surprise"," sweet"," swim"," sword","table"," take"," talk"," tall"," taste"," taxi"," tea"," teach"," team"," tear"," telephone"," television"," tell"," ten"," tennis"," terrible"," test"," than"," that"," the"," their"," then"," there"," therefore"," these"," thick"," thin"," thing"," think"," third"," this"," though"," threat"," three"," tidy"," tie"," title"," to"," today"," toe"," together"," tomorrow"," tonight"," too"," tool"," tooth"," top"," total"," touch"," town"," train"," tram"," travel"," tree"," trouble"," true"," trust"," twice"," try"," turn"," type"," uncle"," under"," understand"," unit"," until"," up"," use"," useful"," usual"," usually"," vegetable"," very"," village"," voice"," visit"," wait"," wake"," walk"," want"," warm"," wash"," waste"," watch"," water"," way"," we"," weak"," wear"," weather"," wedding"," week"," weight"," welcome"," well"," west"," wet"," what"," wheel"," when"," where"," which"," while"," white"," who"," why"," wide"," wife"," wild"," will"," win"," wind"," window"," wine"," winter"," wire"," wise"," wish"," with"," without"," woman"," wonder"," word"," work"," world"," worry"," worry"," worst"," write"," wrong"," year"," yes"," yesterday"," yet"," you"," young"," your","zero"));
        String wd="";
        for (String st : words) {
            if(!dict.contains(st)){
                //wd=st;
                st="\u001B[31m" + st + "\u001B[0m";
            }
            System.out.print(st+" ");
        }
        //view(words);
        for (String st : words) {
            if(st.equals(wd)){
                st="\u001B[0m" + st + "\u001B[0m";
            }
        }  
    }

    public void convertCase(ArrayList<String> words, int val){
        if(val==1){
            int index=-1;
            for(String st: words){
                index++;
                words.set(index, st.toUpperCase());
            }
        }
        else{
            int index=-1;
            for(String st: words){
                index++;
                words.set(index, st.toLowerCase());
            }
        }
        view(words);
    }
}
/*
 * "\033[4mThis is underlined text.\033[0m"
 * "\033[3mThis is italicized text.\033[0m"
 * "\033[1mThis is bold text.\033[0m"
 *

 

class TextEditor {
     private static ArrayList<String> words = new ArrayList<>();
    private static ArrayList<String> line = new ArrayList<>();
    private static Stack<ArrayList<String>> undoStack = new Stack<>();
    private static Stack<ArrayList<String>> redoStack = new Stack<>();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n===== Welcome to Text Editor =====\n");
        boolean flag=true;
        while(flag){
            System.out.println("[1] New File \t[2] Open File\t[3] Exit TextEditor");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    newFile();
                    //System.exit(0);
                    break;
                case 2:
                    System.out.print("Enter File Name : ");
                    String open = sc.next();
                    openFile(open);
                    //System.exit(0);
                    break;
                case 3:
                    flag=false;
                break;
                default:
                    System.out.println("Enter Valid Number!");
                break;
            }
        }
            sc.close();
    }

    public static void newFile() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter New File Name : ");
        String name = sc.next();
        File f1 = new File(name);
        
        if(f1.exists()) {
            System.out.println("\n**File Already Exists!!**");
            while(true) {
                System.out.println("\n[1] Open Existing File \n[2] Create New File");
                System.out.print("Enter Choice : ");
                int ch = sc.nextInt();
                System.out.println();
                if(ch == 1) {
                    openFile(name);
                    return;
                } else if(ch == 2) {
                    newFile();
                    break;
                } else {
                    System.out.println("Enter Valid Option...");
                }
            }
        } 
        else {
            f1.createNewFile();
            openFile(name);
            System.out.println("File Created Successfully");
        }
        sc.close();
    }
     private static void undo() {
        if (!undoStack.isEmpty()) {
            // Push the current state onto the redo stack
            redoStack.push(new ArrayList<>(words));

            // Restore the previous state from the undo stack
            words = undoStack.pop();
            System.out.println("Undo Successful.");
        } else {
            System.out.println("Cannot undo further.");
        }
    }

    private static void redo() {
        if (!redoStack.isEmpty()) {
            // Push the current state onto the undo stack
            undoStack.push(new ArrayList<>(words));

            // Restore the next state from the redo stack
            words = redoStack.pop();
            System.out.println("Redo Successful.");
        } else {
            System.out.println("Cannot redo further.");
        }
    }
    
    
    public static void openFile(String open) throws Exception {
        // ArrayList <String> words=new ArrayList<>();
        // ArrayList <String> line=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        File f2 = new File(open);
        BufferedReader br = new BufferedReader(new FileReader(f2));
        if(f2.exists()) {
            String s;
            System.out.println();
            while((s = br.readLine()) != null){
                String[] str=s.split(" ");
                for (String st : str) {
                    if(st.endsWith(".")){
                        words.add(st.substring(0, st.length()-1));
                        words.add(".");
                    }
                    else{
                        words.add(st);
                    }
                }
                line.add(s);
                System.out.println(s);
            }
            br.close();
            boolean b = true;
            while(b) {
                System.out.println("\n[1] Append Text \t[2] Tools \t[3] Save \t[4] Exit\t [5]undo or redo \n");
                System.out.print("Enter Choice : ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter text to Append : ");
                        sc.nextLine();
                        String newText = sc.nextLine();
                        undoStack.push(new ArrayList<>(words));
                        String[] str = newText.split(" ");
                        for (String st : str) {
                            if (st.endsWith(".")) {
                                words.add(st.substring(0, st.length() - 1));
                                words.add(".");
                            } else {
                                words.add(st);
                            }
                        }
    // Clear the redo stack when a new change is made
                        redoStack.clear();
                        System.out.println("Text Appended Successfully...");
                        break;
                    case 2:
                        Tools t = new Tools();
                        boolean c = true;
                        while(c) {
                            System.out.println("\n\n[1] View\t[2] Find \t[3] Replace \t[4] Spell Check\t[5] Convert Case\t[6] Change Font\t[7] Sort lines LexicoGraphically\t[8] Consecutive duplicate words\t[9] Exit\n");
                            System.out.print("Enter Choice : ");
                            int ch = sc.nextInt();
                            switch (ch) {
                                case 1:
                                    t.view(words);
                                break;
                                case 2:
                                    t.find(words);
                                break;
                                case 3:
                                    t.replace(words);
                                break;
                                case 4:
                                    t.spellCheck(words);
                                break;
                                case 5:
                                    System.out.println("[1] UpperCase\t[2]LowerCase");
                                    int ch1=sc.nextInt();
                                    if(ch1==1){
                                        t.convertCase(words, 1);
                                        
                                    }
                                    else if(ch1==2){
                                        t.convertCase(words, 2);
                                    }
                                    else{
                                        System.out.println("Enter valid Option!");
                                    }
                                break;
                                case 6:
                                    undo();
                                break;
                                case 8:
                                    redo();
                                break;
                                case 7:
                                    String str1="";
                                    for (String string : words) {
                                        str1=str1+" "+string;
                                    }
                                    List<String> lines=new ArrayList<>(Arrays.asList(str1.split(".")));
                                    Collections.sort(lines);
                                    System.out.print(lines);
                                break;
                                case 9:
                                    c = false;
                                break;
                                default:
                                    System.out.println("Enter Valid Number...");
                                    break;
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        b = false;
                        break;
                     case 5:
                        System.out.println("[1] Undo\t[2] Redo");
                        int undoRedoChoice = sc.nextInt();
                        if (undoRedoChoice == 1) {
                            undo();
                        } else if (undoRedoChoice == 2) {
                            redo();
                        } else {
                            System.out.println("Enter valid Option!");
                        }
                        break;
                    default:
                        System.out.println("Enter valid Choice...");
                        break;
                }
            }
        } else if(!f2.exists()) {
            System.out.println("Enter Valid name...");
            System.out.print("Enter File Name : ");
            String name = sc.next();
            openFile(name);
        }
        sc.close();
    }
    
}*/