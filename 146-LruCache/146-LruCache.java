// Last updated: 12/14/2025, 5:56:02 PM
class LRUCache extends LinkedHashMap<Integer,Integer> {
   private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
      
    }
    @Override
    public Integer get(Object key){
        Integer value = super.get(key);
        return value == null ? -1 : value;
    }

  @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}//next time do itg manually

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */