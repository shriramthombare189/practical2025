using System;

class Department
{
    public int DeptID;
    public string DeptName;

    public Department(int id, string name)
    {
        DeptID = id;
        DeptName = name;
    }

    public virtual void DisplayDetails()
    {
        Console.WriteLine($"Department ID: {DeptID}");
        Console.WriteLine($"Department Name: {DeptName}");
    }
}
class Sales : Department
{
    public int SalesTarget;

    public Sales(int id, string name, int target) : base(id, name)
    {
        SalesTarget = target;
    }

    public override void DisplayDetails()
    {
        base.DisplayDetails();
        Console.WriteLine($"Sales Target: {SalesTarget}");
    }
}
class HumanResource : Department
{
    public int EmployeeCount;

    public HumanResource(int id, string name, int count) : base(id, name)
    {
        EmployeeCount = count;
    }

    public override void DisplayDetails()
    {
        base.DisplayDetails();
        Console.WriteLine($"Number of Employees: {EmployeeCount}");
    }
}
class Program
{
    static void Main()
    {
        Console.Write("Enter Sales Dept ID: ");
        int salesId = int.Parse(Console.ReadLine());

        Console.Write("Enter Sales Dept Name: ");
        string salesName = Console.ReadLine();

        Console.Write("Enter Sales Target: ");
        int salesTarget = int.Parse(Console.ReadLine());

        Sales salesDept = new Sales(salesId, salesName, salesTarget);

        Console.Write("\nEnter HR Dept ID: ");
        int hrId = int.Parse(Console.ReadLine());

        Console.Write("Enter HR Dept Name: ");
        string hrName = Console.ReadLine();

        Console.Write("Enter Number of Employees: ");
        int empCount = int.Parse(Console.ReadLine());

        HumanResource hrDept = new HumanResource(hrId, hrName, empCount);

        Console.WriteLine("\n===== Sales Department Details =====");
        salesDept.DisplayDetails();

        Console.WriteLine("\n===== Human Resource Department Details =====");
        hrDept.DisplayDetails();
    }
}
