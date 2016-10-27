package com.dtc.test.client;

import java.util.Arrays;
import java.util.List;

public class Data {

	private String id;
	private String firstName;
	private String lastName;
	private String prefixes;
	private String suffixes;

	public Data(String id, String firstName, String lastName, String prefixes, String suffixes) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.prefixes = prefixes;
		this.suffixes = suffixes;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPrefixes() {
		return prefixes;
	}
	public void setPrefixes(String prefixes) {
		this.prefixes = prefixes;
	}
	public String getSuffixes() {
		return suffixes;
	}
	public void setSuffixes(String suffixes) {
		this.suffixes = suffixes;
	}
}

class Generator {
	public static List<Data> DATA = Arrays.asList(new Data[]{
			new Data("zjvjebywyypgqorighfa","Karen","Mayer","Mr","Phd"),
			new Data("xclmndaawethajnahzxg","Jan","Patton","Mrs","Jr"),
			new Data("brhhqajaiohnjurnrlpc","Alisha","Dunn","Mr","III"),
			new Data("aphgvjjfhzcpozsgfctj","Marsha","Doyle","Mrs","Sr"),
			new Data("ezhxpqxqdgqgqryysgqs","Patrick","Walker","Mr","Phd"),
			new Data("lbkvrksdtrftrgqxnozo","Randi","Velez","Mr","Jr"),
			new Data("hbuxumjzbaqtqujnefvh","Greg","Melton","Mrs","Jr"),
			new Data("dilpwbnloyzeizcbheke","Renee","Manning","Mr","Sr"),
			new Data("taxffvnzahnynhnkcwhy","Christina","McMillan","Mrs","Jr"),
			new Data("bcqzsafifwjeielpeyxh","Bobby","Casey","Mr","II"),
			new Data("ybldypnmtpvebnwngmjv","Jean","Pugh","Mrs","II"),
			new Data("qkvdyjuqzulxdstqukmp","Norman","Buckner","Mr","Jr"),
			new Data("dnobttngdxuvpvjyadoa","Matt","Kerr","Mrs","Phd"),
			new Data("yoyxefumgbafxdopspbx","Dusty","Middleton","Mr","III"),
			new Data("utvggoccemreeqdlowwy","Lindsay","Richardson","Ms","Jr"),
			new Data("pjnvqcydkzmwkydgpzdw","Scott","Richmond","Mr","Jr"),
			new Data("zeqgmopsfsipqacnkmpv","Trey","Gamble","Mrs","Sr"),
			new Data("pmolfefqbmupgsuwyqef","Harley","Hendricks","Mr","Jr"),
			new Data("zxnwznyqjjoszmdeuhxo","Logan","Hopper","Mr","Jr"),
			new Data("tjfuegdxvtewosrmpegy","Brady","Oconnor","Ms","II"),
			new Data("iqyewcicmvbnztuofqov","Miranda","Hale","Ms","Sr"),
			new Data("doiirrkmxgyycpjemkoh","Jake","Hale","Ms","Sr"),
			new Data("gvaxcsjlltvgrgqrvoyl","Gabriel","Molina","Ms","Phd"),
			new Data("ustxyqvsiptzlmexveep","Blake","Gaines","Mrs","Sr"),
			new Data("fmsdwhwamdtwsadohmtg","Brandon","Haley","Ms","Sr"),
			new Data("bhpyvzasankutoyfpwjm","Cheyenne","Simon","Mr","III"),
			new Data("hryybltlhdsmqfiueomi","Clara","Shannon","Mrs","Jr"),
			new Data("lklkmcwpqnbebbupxmib","Hannah","Johns","Mr","Phd"),
			new Data("glmrhaiiehjsivrrjidf","Dixie","Weeks","Ms","III"),
			new Data("dedocopzsluqdvmwgikm","Chester","Bender","Mr","Jr"),
			new Data("hbgkfypeeetvtzsuiaby","Jean","Workman","Ms","II"),
			new Data("qlzcqxxhipjsqvtoxukg","Paul","Goff","Ms","Phd"),
			new Data("gagonrvbgreqopyrprmd","Sue","Dorsey","Mrs","II"),
			new Data("ukevaeuhfopuenednnaa","Tony","McCray","Mrs","Sr"),
			new Data("wlrqenqcffpirovbzczm","Olivia","Hutchinson","Mr","II"),
			new Data("htqipcpznhnrzfyofptp","Beth","Nielsen","Mr","Jr"),
			new Data("xaizpfuhxskpiytvpspi","Myron","Miranda","Mr","Jr"),
			new Data("iclqvipjvzpkjrzwqkpz","Christoph","Sanchez","Mrs","Sr"),
			new Data("loawipzrbcagcmhvutky","Charles","Wilkinson","Mr","II"),
			new Data("cjsvycazxirmtesotsfo","Christoph","Rice","Mrs","III"),
			new Data("ymckwbcdyalcdcvjmiso","Ronald","Church","Mr","II"),
			new Data("qepbopvntttxadijmfsk","Isaac","Cobb","Mr","Phd"),
			new Data("lgwmrfkhkhjypbzhlbxo","Austin","Prince","Mr","II"),
			new Data("avzftgrhnbtnkxmaezgi","Brittany","Bonner","Mr","Sr"),
			new Data("mdxpofqjnkycmwjsvygz","Savannah","Sheppard","Mr","II"),
			new Data("pyweilqhrrchyenawwkj","Brad","Robinson","Mr","III"),
			new Data("wtbwwshcfiytwccofvzp","Carolyn","Casey","Mr","Sr"),
			new Data("qsakqaamwqpoazjleqsh","Kelly","Richard","Mr","Jr"),
			new Data("dpxiqyclzvpkgfpzcrtz","Kenneth","Kirkland","Mr","Sr"),
			new Data("bmfdinetwcwzginhokrx","Mark","McGowan","Ms","Phd"),
			new Data("ivrdndoscxvtctfvojhi","Tracey","Guzman","Mrs","Jr"),
			new Data("pvnzgefrurcmdamxyhjw","Jeff","Morales","Ms","Phd"),
			new Data("cspwcifddiywaeuvoylk","Pamela","Ellison","Ms","III"),
			new Data("qhiksylalwjbxqnupqvv","April","Lindsay","Mr","Phd"),
			new Data("oyucppekhzmdumyfbybl","Haley","Witt","Ms","II"),
			new Data("flujltvqhqayacnyficc","Karen","Butler","Mrs","III"),
			new Data("hokkcyrqrvifgyvbaxop","Loretta","Rich","Ms","Jr"),
			new Data("wlnvprknkoiqrjzvqijv","Kenneth","Key","Mrs","Phd"),
			new Data("xxyzqudbgidglwqvnbzh","Glen","Leblanc","Mrs","Jr"),
			new Data("ctrwyyixxplqcuvinhsn","Wayne","Johnson","Ms","Sr"),
			new Data("mcvenlsjqzzefwxnewti","Harold","Clay","Mr","Phd"),
			new Data("iyahikpdzncjixyilhvi","Ray","Zamora","Mr","II"),
			new Data("llcbmyvibiravirrosmx","Sarah","Lambert","Ms","III"),
			new Data("wvckcvyhncxizbscxghn","Vicki","Owen","Mr","Phd"),
			new Data("lkgjbenqfvzfdwfpqfsf","Leah","Cooke","Ms","Sr"),
			new Data("bcttkxjzfigjzbkqrsly","Emily","Davis","Ms","Phd"),
			new Data("huvxrwlzuperenofcqrn","Brenda","McKenzie","Ms","Sr"),
			new Data("mliwkyakowkqunmxpzab","Lacey","Pruitt","Ms","III"),
			new Data("sxfdglkkbzvvprvutwdu","Dan","Gould","Mrs","II"),
			new Data("nyuycsxzjreihzncyyxz","Tyrone","Holt","Mr","Sr"),
			new Data("doqovorvrjequejnnzkx","Kristina","Horn","Ms","Sr"),
			new Data("mglcxrehgqgyxyxbesfn","Chester","McIntosh","Mrs","II"),
			new Data("yngzeicpvdqmxqslvsmy","Jennifer","Stanton","Ms","III"),
			new Data("wwhkmwgjhirimxqymjgr","Father","Acosta","Mr","Phd"),
			new Data("befncbhaixisnuaynous","Chad","Albert","Ms","Phd"),
			new Data("szcqpyslcmdumfuulbmu","Casey","Benjamin","Mr","III"),
			new Data("bmltwfvumlublpneftpp","Misty","Alexander","Ms","Sr"),
			new Data("nfbpscefhxvekrfljrar","Aaron","Davenport","Mrs","II"),
			new Data("ijdxlounmacojycfranp","Earl","Bird","Mr","III"),
			new Data("kwnkducolejlvzjpynhc","Patty","Keller","Mrs","II"),
			new Data("pxafkaullowahovsqyds","Eugene","Baker","Mr","II"),
			new Data("vquupjplpgwmwvppyffk","Jeannie","Carson","Ms","III"),
			new Data("bmawzqrtbreyewfktwod","Billy","Lee","Ms","Phd"),
			new Data("sgtjgsjrtgopvesvetur","Alyssa","McGuire","Ms","II"),
			new Data("ynyvbglmhoumphwqtwmj","Denise","Harmon","Ms","Jr"),
			new Data("mvgextfhkwkjjehykwcl","Rick","Jordan","Ms","Phd"),
			new Data("ovxcghwpflhpclasuhno","Charlene","Gallegos","Ms","II"),
			new Data("oxtgilyasdpqkvwlgpbr","Lee","Tucker","Mrs","III"),
			new Data("yepokspaxqjoepshnlqg","Betty","Bartlett","Mr","Sr"),
			new Data("pzkfbbhffjrtcceyfnio","Tashia","Sosa","Mrs","Sr"),
			new Data("pvboyhlhaxmsvriovjcj","Cheyenne","Solis","Ms","Phd"),
			new Data("rawxjmbotpnrincqjwnz","Ricky","McKinney","Mrs","III"),
			new Data("ujidxwloyhqokmufnqob","Bobbie","Myers","Ms","III"),
			new Data("krowdhcdzdartjmokdln","Tessa","George","Mr","Phd"),
			new Data("xzdbwuxxkqwtxymvjjqj","Myron","Gill","Mr","III"),
			new Data("xypsujhwzulxqqahwora","Ann","Lindsey","Ms","Sr"),
			new Data("lonmfkndcsjtsjbykqih","Savannah","Patterson","Mrs","II"),
			new Data("ueyqohstgopqgkmrrmql","Judy","Jacobs","Ms","II"),
			new Data("yhkwikzcaclmfpjeijpq","Shawn","Cline","Mrs","Sr"),
			new Data("uwqmsmxgwgecfldqedud","Tony","Larson","Ms","Sr"),
	});
}

