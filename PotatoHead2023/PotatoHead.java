// below is a JavaDoc comment that will be seen on the documentation
/**
 *  Potato Head Class
 *
 * @author Aurora Cichos
 * @version Version 1.0 Date: 12/4/23
 */
public class PotatoHead {
    // instance variables
    /** String with the PotatoHead'sn name*/
    private String name;
    private int age;
    private String catchPhrase;
    private int feet;
    private int arm;
    private int ear;
    private int hat;
    private int nose;
    private int mouth;
    private int accessory;

    /**
     * Constructor for objects of class PotatoHead
     * This is a default constructor
     */
    public PotatoHead() {
        // initialise instance variables
        name = "no name";
        age = 0;
        catchPhrase = "I have no catch phrase yet";
        feet = 1;
        arm = 0;
        ear = 0;
        hat = 0;
        mouth = 0;
        accessory = 0;
    }

    /**
     * Constructor for objects of class PotatoHead
     * This has the parameters.
     * @param String name of PotatoHead
     * @param int age
     * @param String catchPhrase
     */
    public PotatoHead(String initName, int initAge, String initPhrase) {
        // initialise instance variables
        name = initName;
        age = initAge;
        catchPhrase = initPhrase;
        feet = 1;
        arm = 0;
        ear = 0;
        hat = 0;
        mouth = 0;
        accessory = 0;

    }

    /**
     * Constructor for objects of class PotatoHead
     * This has the parameters.
     * @param String name of PotatoHead
     * @param int age
     * @param String catchPhrase
     * @param int feet
     * @param int arm
     * @param int ear
     * @param int hat
     * @param int nose
     * @param int mouth
     * @param int accessory
     */
    public PotatoHead(String initName, int initAge, String initPhrase, int initFeet, int initArm, int initEar, int initHat, int initNose, int initMouth, int initAccessory) {
        // initialise instance variables
        name = initName;
        age = initAge;
        catchPhrase = initPhrase;
        feet = initFeet;
        arm = initArm;
        ear = initEar;
        hat = initHat;
        nose = initNose;
        mouth = initMouth;
        accessory = initAccessory;
    }


    /**
     * Getter for name variable
     * @return String name of PotatoHead
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name variable
     * @param String name to set for PotatoHead
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Getter for age variable
     * @return int age of PotatoHead
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Setter for age variable
     * @param int age to set for PotatoHead
     * precondition: age cannot be greater than 100
     */
    public void setAge(int newAge)
    {
        if (newAge > 100) 
        {
            age = 0;
        }
        else
        {
            age = newAge;
        }

    }

    /**
     * Getter for catchPhrase variable
     * @return String catchPhrase of PotatoHead
     */
    public String getCatchPhrase() {
        return catchPhrase;
    }

    /**
     * Setter for catchPhrase variable
     * @param String catchPhrase to set for PotatoHead
     */
    public void setCatchPhrase(String newCatchPhrase) {
        catchPhrase = newCatchPhrase;
    }

    /**
     * Getter for feet variable
     * @return int feet of PotatoHead
     */
    public int getFeet() {
        return feet;
    }

    /**
     * Setter for feet variable
     * @param int feet to set for PotatoHead
     * precondition: feet must be greater than or equal to 0 and less than or equal to 2
     */
    public void setFeet(int newFeet) {
        if (newFeet >= 0 && newFeet <= 2) {
            feet = newFeet;
        } else {
            feet = 0;
        }
    }

    /**
     * Getter for ear variable
     * @return int ear of PotatoHead
     */
    public int getEar() {
        return ear;
    }

    /**
     * Setter for ear variable
     * @param int ear to set for PotatoHead
     * precondition: ear must be greater than or equal to 0 and less than or equal to 4
     */
    public void setEar(int newEar) {
        if (newEar >= 0 && newEar <= 4) {
            ear = newEar;
        } else {
            ear = 0;
        }
    }

    /**
     * Getter for hat variable
     * @return int hat of PotatoHead
     */
    public int getHat() {
        return hat;
    }

    /**
     * Setter for hat variable
     * @param int hat to set for PotatoHead
     * precondition: hat must be greater than or equal to 0 and less than or equal to 3
     */
    public void setHat(int newHat) {
        if (newHat >= 0 && newHat <= 3) {
            hat = newHat;
        } else {
            hat = 0;
        }
    }

    /**
     * Getter for nose variable
     * @return int nose of PotatoHead
     */
    public int getNose() {
        return nose;
    }

    /**
     * Setter for nose variable
     * @param int nose to set for PotatoHead
     * precondition: nose must be greater than or equal to 0 and less than or equal to 4
     */
    public void setNose(int newNose) {
        if (newNose >= 0 && newNose <= 4) {
            nose = newNose;
        } else {
            nose = 0;
        }
    }

    /**
     * Getter for mouth variable
     * @return int mouth of PotatoHead
     */
    public int getMouth() {
        return mouth;
    }

    /**
     * Setter for mouth variable
     * @param int mouth to set for PotatoHead
     * precondition: mouth must be greater than or equal to 0 and less than or equal to 6
     */
    public void setMouth(int newMouth) {
        if(newMouth >= 0 && newMouth <= 6) {
            mouth = newMouth;
        } else {
            mouth = 0;
        }
    }

    /**
     * Getter for accessory variable
     * @return int accessory of PotatoHead
     */
    public int getAccessory() {
        return accessory;
    }

    /**
     * Setter for accessory variable
     * @param int accessory to set for PotatoHead
     * precondition: accessory must be greater than or equal to 0 and less than or equal to 8
     */
    public void setAccessory(int newAccessory) {
        if (newAccessory >= 0 && newAccessory <= 8) {
            accessory = newAccessory;
        } else {
            accessory = 0;
        }
    }

    /**
     * method that performs a birthday, incrementing the age by 1
     * @return a statement celebrating the birthday.
     */
    public String haveBirthday()
    {
        age++;
        return "Happy birthday! " + name + " is now " + age + " years old!";
    }

    /**
     * toString for PotatoHead object - inlcudes info on all Instance variables
     */
    public String toString()
    {
        //return a string that tells us about the Potatohead and how to make it with the parts...
        return "Name: " + name + "\nAge: " + age + "\nCatch Phrase: " + catchPhrase + "\nFeet: " + feet + "\nArm: " + arm + "\nEar: " + ear + "\nHat: " + hat + "\nNose: " + nose + "\nMouth: "+ mouth + "\nAccessory: " + accessory;
    }
}
