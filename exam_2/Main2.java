/**
 Each Box has some basic properties :  length,height,width,area, flute;

 A box can either use pins or pasting() to join.

 A box can either single part or double part.

 there are 7 types of flute : A,B,C,E,F,G and B(B is mostly used).

 a flute has gsm and extra gsm;

 you need to calcuate cost of a box  : area * totalGSM * ExtraGSM * stitching cost (if double part cost is multiplied by 3)

 where as Area : length * width * hight

 and total GSM : extraGSM + GSM * 100;

 and Extra GSM For Flute :

 A = 10,B = 30,C = 20,E = 40,F =50,G = 20

 and stitching cost :

 1.if box has a pin then  :  10rs per pin

 2.if box has a pasting then cost is :

 1. Universal : 20

 2. AllFlapMeeting : 30

 3. HoneyComb : 40

 4. ReverseTuckIn : 40

 5. TopOpening SnapLock = 50
 */

class Pin {
}
class Pasting {
}

interface SinglePartBox {
    double getValue (SinglePartBox singlePartBox);
}
interface DoublePart {
    double getValue (DoublePart doublePart);
}
class BoxType {}
class SingleBox extends BoxType{
    double getValue() {
        return 1;
    }
}
class DoubleBox extends BoxType{
    double getValue() {
        return 3;
    }
}

class PinningCost {
    final static double price = 10;
}
class PastingCost {
    final static double universal = 20;
    final static double allFlapMeeting = 20;
    final static double honeyComb = 20;
    final static double reverseTuckIn = 20;
    final static double topOpeningSnapLock = 20;
}
class GSMPrice {
    final static double price = 20;
}

class ExtraGSMPrice {
    final static double priceA = 10;
    final static double priceB = 30;
    final static double priceC = 20;
    final static double priceE = 40;
    final static double priceF = 50;
    final static double priceG = 20;
}

class Flute {}

class A extends Flute {
    double price = ExtraGSMPrice.priceA;
}
class B extends Flute {
    double price = ExtraGSMPrice.priceB;
}
class C extends Flute {
    double price = ExtraGSMPrice.priceC;
}
class E extends Flute {
    double price = ExtraGSMPrice.priceE;
}
class F extends Flute {
    double price = ExtraGSMPrice.priceF;
}
class G extends Flute {
    double price = ExtraGSMPrice.priceG;
}

interface TotalCost {
    double getCost(double extraGSM, Pin pin, int num);
    double getCost(double extraGSM, Pasting paste);
}


class Box {
    double length, height, width, area;
    String boxType;
    void setBox(double length, double height, double width, String boxType) {
        this.height = height;
        this.length = length;
        this.width = width;
        this.boxType = boxType;
        area = length * height * width;
    }
}
class Universal extends Box implements TotalCost {

    @Override
    public double getCost(double extraGSM, Pin pin, int num) {
        double totalCost = area * (extraGSM + GSMPrice.price * 100) + (PinningCost.price * num);
        if (boxType.equalsIgnoreCase("doubletypebox"))
            return totalCost * 3;
        return totalCost;
    }

    @Override
    public double getCost(double extraGSM, Pasting paste) {
        double totalCost = area * (extraGSM + GSMPrice.price * 100) + PastingCost.universal;
        if (boxType.equalsIgnoreCase("doubletypebox"))
            return totalCost * 3;
        return totalCost;
    }
}
class AllFlapMeeting extends Box implements TotalCost{
    @Override
    public double getCost(double extraGSM, Pin pin, int num) {
        double totalCost = area * (extraGSM + GSMPrice.price * 100) + (PinningCost.price * num);
        if (boxType.equalsIgnoreCase("doubletypebox"))
            return totalCost * 3;
        return totalCost;
    }

    @Override
    public double getCost(double extraGSM, Pasting paste) {
        double totalCost = area * (extraGSM + GSMPrice.price * 100) + PastingCost.allFlapMeeting;
        if (boxType.equalsIgnoreCase("doubletypebox"))
            return totalCost * 3;
        return totalCost;
    }
}
class HoneyComb extends Box implements TotalCost{
    @Override
    public double getCost(double extraGSM, Pin pin, int num) {
        double totalCost = area * (extraGSM + GSMPrice.price * 100) + (PinningCost.price * num);
        if (boxType.equalsIgnoreCase("doubletypebox"))
            return totalCost * 3;
        return totalCost;
    }

    @Override
    public double getCost(double extraGSM, Pasting paste) {
        double totalCost = area * (extraGSM + GSMPrice.price * 100) + PastingCost.honeyComb;
        if (boxType.equalsIgnoreCase("doubletypebox"))
            return totalCost * 3;
        return totalCost;
    }
}
class ReverseTuckIn extends Box implements TotalCost{
    @Override
    public double getCost(double extraGSM, Pin pin, int num) {
        double totalCost = area * (extraGSM + GSMPrice.price * 100) + (PinningCost.price * num);
        if (boxType.equalsIgnoreCase("doubletypebox"))
            return totalCost * 3;
        return totalCost;
    }

    @Override
    public double getCost(double extraGSM, Pasting paste) {
        double totalCost = area * (extraGSM + GSMPrice.price * 100) + PastingCost.reverseTuckIn;
        if (boxType.equalsIgnoreCase("doubletypebox"))
            return totalCost * 3;
        return totalCost;
    }
}
class TopOpeningSnapLock extends Box implements TotalCost{
    @Override
    public double getCost(double extraGSM, Pin pin, int num) {
        double totalCost = area * (extraGSM + GSMPrice.price * 100) + (PinningCost.price * num);
        if (boxType.equalsIgnoreCase("doubletypebox"))
            return totalCost * 3;
        return totalCost;
    }

    @Override
    public double getCost(double extraGSM, Pasting paste) {
        double totalCost = area * (extraGSM + GSMPrice.price * 100) + PastingCost.topOpeningSnapLock;
        if (boxType.equalsIgnoreCase("doubletypebox"))
            return totalCost * 3;
        return totalCost;
    }
}


public class Main2 {
    public static void main(String[] args) {

    }
}
