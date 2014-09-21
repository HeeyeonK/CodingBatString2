
public class endOther
{
    public boolean endOther(String a, String b) {
        a.toLowerCase();
        b.toLowerCase();
        int lena = a.length();
        int lenb = b.length();
        if (lena > lenb) {
            for (int i=0; i<lena-lenb+1; i++){
                if (a.substring(i,lena).equals(b)){
                    return true;
                }
            }
            return false;
        }
        else if (lenb > lena) {
            for (int i=0; i<lenb-lena+1; i++){
                if (b.substring(i,lenb).equals(a)){
                    return true;
                }
            }
            return false;
        }
        else {
            if (a.equals(b)){
                return true;
            }
            else {
                return false;
            }
        }
  }
}
