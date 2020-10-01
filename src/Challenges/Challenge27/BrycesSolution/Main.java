package Challenges.Challenge27.BrycesSolution;


public class Main {


    public static void main(String[] args) {

        Game Mario = new Game("Super Mario Brothers 3", "Cartridge", "Nintendo");
        Game Zelda = new Game("The Legend of Zelda", "Cartridge", "Nintendo");
        Game Metroid = new Game("Super Metroid", "Cartridge", "Nintendo");
        Game pacman = new Game("Pacman", "Cartridge", "Atari");
        Game frogger = new Game("Frogger", "Cartridge", "Atari");
        Game asteroids = new Game("Asteroids", "Cartridge", "Atari");
        Game GTA4 = new Game("Grand Theft Auto 4", "Blu Ray", "PS3");
        Game Portals2 = new Game("Portals 2", "Blu Ray", "PS3");
        Game LittleBigPlanet = new Game("Little Big Planet", "Blu Ray", "PS3");


        PS3 ps3 = new PS3("PS3", 4, 1080, "Blu Ray");
        System.out.println(ps3.toString());
        ps3.powerOn(true);
        ps3.contollerOne.pressButton(ps3.contollerOne.circleButton());
        ps3.contollerOne.pressButton(ps3.contollerTwo.xButton());
        ps3.contollerOne.leftJoystick().moveJoystick(25);
        ps3.insertMedia(Portals2);
        ps3.insertMedia(LittleBigPlanet);
        ps3.powerOn(false);

        System.out.println("=================");

        Nintendo nintendo = new Nintendo("Nintendo", 2, 240 * 256, "Cartridge");
        System.out.println(nintendo.toString());
        nintendo.powerOn(true);
        nintendo.nintendoControllerOne.pressButton
                (nintendo.nintendoControllerTwo.getStart());
        nintendo.nintendoControllerTwo.pressButton
                (nintendo.nintendoControllerOne.getaButton());
        nintendo.insertMedia(Mario);
        nintendo.powerOn(false);

        System.out.println("=================");

        Atari atari = new Atari("Atari", 1, 160 * 192, "Cartridge");
        System.out.println(atari.toString());
        atari.powerOn(true);
        atari.atariController.pressButton(atari.atariController.action);
        atari.atariController.joystick.moveJoystick(25);
        atari.insertMedia(frogger);
        atari.powerOn(false);

        System.out.println("=================");


    }
}
