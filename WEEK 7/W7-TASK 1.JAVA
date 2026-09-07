
class ParkingSystem {

    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {

        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            }
        }

        else if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            }
        }

        else if (carType == 3) {
            if (small > 0) {
                small--;
                return true;
            }
        }

        return false;
    }
}

INPUT
big = 1
medium = 1
small = 0

addCar(1)
addCar(2)
addCar(3)
addCar(1)

OUTPUT
true
true
false
false