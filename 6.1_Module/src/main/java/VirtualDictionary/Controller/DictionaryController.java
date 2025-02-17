package VirtualDictionary.Controller;

import VirtualDictionary.Model.Dictionary;
import VirtualDictionary.View.DictionaryView;

public class DictionaryController {

    private final DictionaryView dictionaryView;
    private final Dictionary dictionary = new Dictionary();

    public DictionaryController(DictionaryView dictionaryView) {
        this.dictionaryView = dictionaryView;
    }

    public void getTextFieldSearch() {
        String search = dictionaryView.getTextField();

        if (search != null) {
            dictionaryView.setSearchResult(dictionary.getMeaning(search));            
        }
    }

}
