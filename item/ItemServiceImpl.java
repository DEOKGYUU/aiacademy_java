package item;

public class ItemServiceImpl implements ItemService {
	private Item[] items;
	private int index;
	
	public ItemServiceImpl() {
		items = new Item[3];
		index = 0;
	}
	
	@Override
	public void addCart(Item item) {
		items[index++] = item;
	}
	
	@Override
	public void list() {
		for(int i=0; i<index; i++) {
			System.out.println(items[i]);
		}
	}
}
