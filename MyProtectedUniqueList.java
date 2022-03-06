import java.util.*;

public class MyProtectedUniqueList <T> implements Iterable{
    private List<T> words;
    private String KeyWord;
    private int count;


    public MyProtectedUniqueList(String keyWord) {
        this.words = new ArrayList<>();
        KeyWord = keyWord;
    }

    public void add(T word,String keyWord){
        if(this.KeyWord.equals(keyWord)) {
            if (word.equals("") || word.equals(null)) {
                try {
                    throw new Exception("word cannot be empty or null");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return;
            }
            words.add(word);
            count++;
            return;
        }
        else{
            try {
                throw new Exception("invalid keyWord");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void remove(T word,String keyWord){
        if(this.KeyWord.equals(keyWord)) {
            if (word.equals("") || word.equals(null)) {
                try {
                    throw new Exception("word cannot be empty or null");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return;
            }
            words.remove(word);
            count--;
            return;
        }
        else{
            try {
                throw new Exception("invalid keyWord");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void removeAt(int index,String keyWord){
        if(this.KeyWord.equals(keyWord)) {
            if (index<0 || index>this.words.size()) {
                try {
                    throw new Exception("invalid index");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return;
            }
            words.remove(index);
            count--;
            return;
        }
        else{
            try {
                throw new Exception("invalid keyWord");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void clear(String keyWord){
        if(!this.KeyWord.equals(keyWord)){
            try {
                throw new Exception("invalid keyWord");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }else{
            words.clear();
            count=0;
        }
    }

    public void sort(String keyWord){
        ///השגיאות מופיעות בגלל שהפכתי את המחלקה לגנרית ודיברנו על זה בווטסאפ
        if(!this.KeyWord.equals(keyWord)) {
            try {
                throw new Exception("invalid keyWord");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }
        else{
            Collections.sort(words);
            var set=new HashSet<String >();
            for(var item:words){
                set.add(item);
            }
            words.clear();
            for (var item:set){
                words.add(item);
            }
            count=words.size();
        }
    }
    @Override
    public String toString() {
        return "MyProtectedUniqueList{" +
                "words=" + words +
                '}';
    }


    @Override
    public Iterator iterator() {
        return new Iterator() {
            int index=0;

            @Override
            public boolean hasNext() {
                return this.index<count;
            }

            @Override
            public Object next() {
                return words.get(index++);
            }
        };
    }
}
