public class Face {
    public static void main(String[] args) {
        khana j1 = new khana();
        j1.Zindagi();
        j1.officejana();

        collegejana bus = new collegejana();
        bus.Zindagi();
    }
}

interface student{
    void Zindagi();
}

interface employee{
    void officejana();
}

class khana implements student,employee{

    public void Zindagi(){
        System.out.println("Zindagi ke sath khana bhi jaruri hai zindagi ke sath bhi jindagi ke baad be");
    }

    public void officejana(){
        System.out.println("officejake khana bhi jaruri hai..");
    }
}

class collegejana implements student{

    public void Zindagi(){
        System.out.println("collegejana jaruri hai zindagi ke sath bhi jindagi ke baad be🌝");
    }
}

class Assingmentkarna implements student{

    public void Zindagi(){
        System.out.println("Assingment karne pdte hai 10 marks ke liye ise kehte hai zindagi ke L lagna💯");
    }
}

class hostelmerehna implements student{

    public void Zindagi(){
        System.out.println("Hostel me kam budget me rehna pdta hai bhai 😒");
    }
}

class Mojmastikarna implements student{

    public void Zindagi(){
        System.out.println("mojmasti karna bhi jaruri hai bahi 😎");
    }
}
