package day13;


public class Task1 {
    public static void main(String[] args) {
        User declan = new User("Declan");
        User walter = new User("Heisenberg");
        User spongeBob = new User("Sponge Bob");

        declan.sendMessage(walter, "Who the hell are you?");
        declan.sendMessage(walter,"Mmm?");
        walter.sendMessage(declan, "You all know exactly who I am");
        walter.sendMessage(declan, "Say my name.");
        walter.sendMessage(declan,"C'mon say it");
        spongeBob.sendMessage(declan,"Hello, I am Sponge Bob");
        spongeBob.sendMessage(declan,"Did you see my friend Patrick?");
        spongeBob.sendMessage(declan, "I need him right now");
        declan.sendMessage(spongeBob, "C'mon dude, we don't give a shit about your friend");
        declan.sendMessage(spongeBob, "This guy looks scary, I need to talk to him");
        declan.sendMessage(spongeBob, "Please, leave us alone");
        spongeBob.sendMessage(declan,"Patrick...");

        MessageDataBase.showDialog(declan,walter);
        MessageDataBase.showDialog(declan,spongeBob);


    }
}
