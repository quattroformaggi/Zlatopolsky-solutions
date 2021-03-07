import java.util.Random;

class Coin{
    public String flip(){
        Random r = new Random();
        if(r.nextInt(2) % 2 == 0) return "Heads";
        else return "Tails";
    }
}

class Coinflip {
    public static void main(String[] args) {
        System.out.println(new Coin().flip());
    }
}