import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class RefreshmentAssignments
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {


        // 1.
        /*
          ArrayList<String> elements = new ArrayList<>();
          elements.add("Hey");
          String string = scanner.nextLine();
          boolean isStringInArrayList = doesArrayListContainString(elements, string);
          System.out.println(isStringInArrayList);
        */


        // 2.
        // See separate directory for this assignment

        // 3.
        /*System.out.println("Please type in the current grass length");
        double currentGrassHeight = scanner.nextDouble();

        System.out.println("Please type in the length of the grass at which it must be cut");
        double grassCuttingLength = scanner.nextDouble();

        double lengthForGrassCutting = calculateGrassCuttingLength(currentGrassHeight, grassCuttingLength);
        System.out.println(lengthForGrassCutting);*/


        // 4.
        /*
          int numberOfCharactersInRowAndColumn = 6;
          String characterToPrint = scanner.next();
          int printPattern = printPattern(numberOfCharactersInRowAndColumn, characterToPrint);
          System.out.println(printPattern);
        */


        // 5.
        String input = scanner.nextLine();
        String checkStringConditions = receiveStringInput(input);
        System.out.println(checkStringConditions);

        // 6.
        /*
          ArrayList<String> addToAndPrintArrayList = new ArrayList<>();
          ArrayList<String> sortedArrayList =  addToAndPrintArrayList(addToAndPrintArrayList);
        */

        // 7.
        // stringPositionArray();
    }


    // 1.
    public static boolean doesArrayListContainString(ArrayList<String> elements, String string)
    {
        if (!elements.contains(string))
        {
            return false;
        }
        else
        {
            System.out.println("The String has been found");
            return true;
        }
    }


    // 2.
    // Please see the separate directory for this assignment


    // 3.
    public static double calculateGrassCuttingLength(double currentGrassHeight, double grassCuttingLength)
    {
        System.out.println("Please enter the max length of the grass:");
        double grassMaxLength = scanner.nextDouble();

        double grassGrowLengthInCentimetres = .8;
        double growLengthPerWeek = currentGrassHeight * grassGrowLengthInCentimetres;

        if (grassMaxLength - currentGrassHeight == 0)
        {
            System.out.println("Grass must be cut");
        }
        else if (growLengthPerWeek < grassMaxLength)
        {
            System.out.println("The length the grass can grow more before having to be cut:");
            return grassMaxLength - currentGrassHeight;
        }

        return grassCuttingLength;
    }


    // 4.
    public static int printPattern(int numberOfCharactersInRowAndColumn, String characterToPrint)
    {
        for (int i = 0; i < numberOfCharactersInRowAndColumn; i++)
        {
            for (int j = 0; j < numberOfCharactersInRowAndColumn; j++)
            {
                System.out.print(characterToPrint);
            }

            System.out.println();
        }

        return numberOfCharactersInRowAndColumn;
    }


    // 5.
    public static String receiveStringInput(String input)
    {
        if(input.equals(input.toUpperCase()))
        {
            return input;
        }

        else if(input.length() > 3)
        {
           String upperCasedString = "";
           upperCasedString = input.substring(0, 1).toUpperCase() + input.substring(1);
           return upperCasedString;
        }

        else if(input.length() < 3)
        {
            return input.toLowerCase();
        }

        return "";
    }


    // 6.
    public static ArrayList<String> addToAndPrintArrayList(ArrayList<String> addToAndPrintArrayList)
    {

        int numberOfInputs = 0;

        while (numberOfInputs < 5)
        {
            String addInputToList = scanner.nextLine();
            addToAndPrintArrayList.add(addInputToList);
            numberOfInputs++;
        }


        Collections.sort(addToAndPrintArrayList);
        System.out.println(addToAndPrintArrayList);

        return addToAndPrintArrayList;
    }



    // 7.
    public static int stringPositionInArray(String[] stringArray, String string) throws Exception
    {
        for (int i = 0; i < stringArray.length; i++)
        {
            if (stringArray[i].equals(string))
            {
                return i;
            }
        }

        throw new Exception();
    }

    public static void stringPositionArray()
    {
        String[] stringArray = {"Hey", "Test", "Bil"};


        try
        {
            stringPositionInArray(stringArray, "bil");
        }
        catch (Exception e)
        {
            System.out.println("String not found");
        }
    }
}
