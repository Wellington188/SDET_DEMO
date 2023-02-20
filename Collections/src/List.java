import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        String[] allCodes = {"001","002","003","004","05"};
        String[] assignedCodes = {"003","004"};

        String[] unAssignedCodes = getUnassignedCodes(allCodes, assignedCodes);
        System.out.println(Arrays.toString(unAssignedCodes));
    }

    private static String[] getUnassignedCodes(String[] allCodes, String[] assignedCodes) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(allCodes));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(assignedCodes));

        list.removeAll(list2);
        return list.toArray(new String[list.size()]);
    }
}
