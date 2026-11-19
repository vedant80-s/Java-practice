abstract class Machine {
    abstract void operate();
}

class Printer extends Machine {
    void operate() {
        System.out.println("Printing document...");
    }
}

class Scan extends Machine {
    void operate() {
        System.out.println("Scanning document...");
    }

}

class Que7{
    public static void main(String[] args) {
        Machine p = new Printer();
        Machine s = new Scan();

        p.operate();
        s.operate();
    }
}
