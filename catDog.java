
public class catDog
{

    public boolean catDog(String str)
    {
    int cat = 0;
    int dog = 0;
        for (int i=0; i<str.length()+3; i++) {
            if (str.substring(i,i+3).equals("cat")){
                cat = cat + 1;
            }
            else if (str.substring(i,i+3).equals("dog")){
                dog = dog + 1;
            }
        }
        if (cat == dog) {
            return true;
        }
        else {
            return false;
        }
    }
}   
