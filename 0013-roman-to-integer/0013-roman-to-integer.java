    class Solution {
        static Map<String,Integer>map=new HashMap<>();
        static{
            map.put( "I",  1);
        
        map.put("V"  ,5);
        map.put("X"  ,10);
        map.put("L"  ,50);
        map.put("C"  ,100);
        map.put("D"  ,500);
        map.put("M",1000);

    map.put("IX",9);
    map.put("IV",4);
    map.put("XL",40);
    map.put("XC",90);
    map.put("CD",400);
    map.put("CM",900);
    }
        public int romanToInt(String s) {
            int sum=0;
            int i=0;
            while(i<s.length()){
                if(i<s.length()-1){
                    String twosymbols=s.substring(i,i+2);
                    if(map.containsKey(twosymbols)){
                        sum+=map.get(twosymbols);
                        i=i+2;
                        continue;
                    }

                }

                String onesymbol=s.substring(i,i+1);
                if(map.containsKey(onesymbol)){
                    sum+=map.get(onesymbol);
                        i=i+1;

                    
                }

            }
            return sum;
            
        }
    }