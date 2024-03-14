class CPU
{
    float price;
    class Processor
    {
        int no_of_core;
        String mnfname;
        Processor(int noc,String mnf)
        {
            no_of_core=noc;
            mnfname=mnf;
        }
        void display()
        {
            System.out.println("Processor info ") ;
            System.out.println("Number of cores : "+ no_of_core);
            System.out.println("Manufacture Name  : "+ mnfname);
        }
    }
    static class RAM
    {
        int memry;
        String rmanf;
        RAM(int mem,String rmnf)
        {
            memry=mem;
            rmanf=rmnf;
        }
        void display()
        {
            System.out.println("RAM info ") ;
            System.out.println("Memory : "+ memry +" GB ");
            System.out.println("Manufacture Name  : "+ rmanf);
        }
    }
    void display()
    {
        System.out.println("CPU Price : "+price) ;
    }

    public static void main(String arg[])
    {
        CPU.RAM obj1=new CPU.RAM(8, "Intel");
        CPU obj2 = new CPU();
        CPU.Processor obj3=obj2.new Processor(8, "Samsung");
        obj1.display();
        obj3.display();
    }
}