/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personapp;

public class Employee extends Person
{
    private String socSecNum;
    
    public Employee() {}
    
    public void setSocSecNum(String socSecNum)
    {
        this.socSecNum = socSecNum;
    }
    
    public String getSocSecNum()
    {
        return socSecNum;
    }
    
    @Override
    public String getDisplayText()
    {
        return super.toString() + "Social security number: " + socSecNum + "\n";
    }
}
