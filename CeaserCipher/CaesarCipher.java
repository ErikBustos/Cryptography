package CeaserCipher;

class CaesarCipher {
    public static void main(String[] args) {
        String str= "MHQOQEQEXMSQZFQPQXMCGQZMPUQQEBQDMZMPMXMCGQTMOQOAEMECGQZMPUQBGQPQUYMSUZMD";
        str= str.toLowerCase();
        for(int i=0;i<25; i++)
            System.out.println(i+" "+ceaserCipherDecryption(str, i));

        //System.out.print(ceaserCipherEncryption("aveceseslagentedelaquenadieesperanadalaquehacecosasquenadiepuedeimaginar",12));
    }

    static String ceaserCipherEncryption(String str, int key){
        String decryptS= "";
        for(int i=0; i< str.length(); i++){
            char c;
            if(str.charAt(i) != ' '){
                c= (char) (((int)str.charAt(i)+key - 97) % 26 +97);
                decryptS+=c;
            }else
            decryptS+= str.charAt(i);
        }
        return decryptS;
    }
 
    static String ceaserCipherDecryption(String str, int key){
        String decryptS= "";
        for(int i=0; i< str.length(); i++){
            char c;
            int value;
            if(str.charAt(i) != ' '){
                value=(int)str.charAt(i)- key - 97;
                if(value<0){
                    value+=122+1;
                    c=(char) value;
                }
                else
                    c= (char) ((value) % 26 +97);
                decryptS+=c;
            }else
            decryptS+= str.charAt(i);
        }
        return decryptS;
    }
}

/* 
_______________EXAMPLES: ____________________

FGVTCU FG ECFC EQFKIQ JCA WP GPKIOC
2 detras de cada codigo hay un enigma

MFXYF ZS WJQTO IJXHTRUZJXYT FHNJWYF QF MTWF ITX AJHJX FQ INF
5 hasta un reloj descompuesto acierta la hora dos \eces al dia 
5 hasta un reloj descompuesto acierta la hora dos veces al dia

NSYCM BOYVY CXEWO BYCOX DOBYC VYNOW KCOCS XFOXD YNOVR YWLBO
10 diosc reolo snume rosen teros lodem asesi nvent odelh ombre

UFQEA GZUHQ DEUPM PVQEG UFMPQ SGMPM XMVMD M
12 iteso unive rsida djesu itade guada lajar a

CRJDRKVDRKZTRJJFEVCRCWRSVKFTFEVCTLRCUZFJYRVJTIZKFVCLEZMVIJF
17 lasmatematicassonelalfabetoconelcualdioshaescritoeluniverso

MHQOQEQEXMSQZFQPQXMCGQZMPUQQEBQDMZMPMXMCGQTMOQOAEMECGQZMPUQBGQPQUYMSUZMD
12 aveceseslagentedelaquenadieesperanadalaquehacecosasquenadiepuedeimaginar

*/