class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase(); // 소문자로 치환
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        new_id = new_id.replaceAll("\\.{2,}", "."); // 2개 이상 연속된 .을 .으로 변환
        new_id = new_id.replaceAll("^\\.|\\.$", ""); // .이 처음이나 끝에 위치하면 제거
        if (new_id.isEmpty()) {
            new_id = "a";
        }
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }

        new_id = new_id.replaceAll("\\.$", "");

        if (new_id.length() <= 2) {
            int n = 3 - new_id.length();
            for (int i = 0; i < n; i++) {
                new_id += String.valueOf(new_id.charAt(new_id.length() - 1));
            }
        }
        // System.out.println(new_id);
        return new_id;
    }
}