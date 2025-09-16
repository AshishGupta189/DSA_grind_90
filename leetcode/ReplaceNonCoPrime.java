class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list= new ArrayList();
        if(nums.length==1){
            list.add(nums[0]);
            return list;
        }
        Stack<Integer> st = new Stack<>();
        st.push(nums[0]);
        st.push(nums[1]);
        for(int i=2;i<nums.length;i++){
            while(st.size()>1 && gcd(st.get(st.size()-1),st.get(st.size()-2))>1){
                st.push(lcm(st.pop(),st.pop()));
            }
            st.push(nums[i]);
        }

        while(st.size()>1 && gcd(st.get(st.size()-1),st.get(st.size()-2))>1){
            st.push(lcm(st.pop(),st.pop()));
        }
        //System.out.println(st);
        return new ArrayList<>(st);
    }
    int gcd(int a,int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    int lcm(int a,int b){
        return (a / gcd(a, b))*b;
    }
}