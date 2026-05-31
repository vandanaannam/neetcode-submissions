class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr = s1.toCharArray();

        Arrays.sort(arr);

        String sorted1 = new String(arr);
        System.out.println(sorted1);
        for(int i=0; i<= (s2.length()) - (s1.length()); i++){
            String s3 = s2.substring(i,i+s1.length());
            char[] arr2 = s3.toCharArray();

            Arrays.sort(arr2);

            String sorted2 = new String(arr2);
            System.out.println(sorted2);
            if(sorted1.equals(sorted2)){
                return true;
            }
        }
        return false;
    }
    
}
