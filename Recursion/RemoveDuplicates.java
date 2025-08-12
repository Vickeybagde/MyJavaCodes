package Recursion;

public class RemoveDuplicates {
    
    public static void DuplicateskoRemoveKaro(String str, int idx, StringBuilder newstr, boolean map[]) {
        // Base Case
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        // Current character
        char Currchar = str.charAt(idx);

        // Duplicate check
        if (map[Currchar - 'a'] == true) {
            // Agar already present hai, skip
            DuplicateskoRemoveKaro(str, idx + 1, newstr, map);
        } else {
            // First time aa raha hai
            map[Currchar - 'a'] = true;
            DuplicateskoRemoveKaro(str, idx + 1, newstr.append(Currchar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        DuplicateskoRemoveKaro(str, 0, new StringBuilder(""), new boolean[26]);
    }
}


