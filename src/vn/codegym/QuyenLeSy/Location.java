package vn.codegym.QuyenLeSy;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public static Location locateLargest(double[][] a){
        Location location = new Location();
        location.maxValue = 0;

        for(int rows = 0; rows < a.length; rows++)
        {
            for (int col = 1; col < a[rows].length; col++)
            {
                if(location.maxValue < a[rows][col])
                {
                    location.maxValue = a[rows][col];
                    location.row = rows;
                    location.column = col;
                }
            }
        }
        return location;
    }
}
