package uz.gita.infoapp.controler;

import java.util.ArrayList;
import java.util.List;

import uz.gita.infoapp.R;
import uz.gita.infoapp.model.ModelData;

public class AppController {

    private static AppController controller;

    public static AppController getInstance() {
        if (controller == null) {
            controller = new AppController();
        }
        return controller;
    }

    private List<ModelData> data = new ArrayList<>();


    private AppController() {
        load();
    }

    private void load() {
        data.add(new ModelData(0, R.string.name_0, R.drawable.turin_pic_4, R.string.italy_1, R.drawable.italy_pic_2, R.string.italy_2, R.drawable.italy_pic_3, R.string.italy_3, R.drawable.italy_pic_4, R.string.italy_4, R.drawable.italy_pic_5, R.string.italy_5, R.drawable.italy_pic_6, R.string.italy_6, R.drawable.italy_pic_7, R.string.italy_7));
        data.add(new ModelData(1, R.string.name_1, R.drawable.rome_pic_1, R.string.rome_1, R.drawable.rome_pic_2, R.string.rome_2, R.drawable.rome_pic_3, R.string.rome_3, R.drawable.rome_pic_4, R.string.rome_4, R.drawable.rome_pic_5, R.string.rome_5, R.drawable.rome_pic_6, R.string.rome_6, R.drawable.rome_pic_7, R.string.rome_7));
        data.add(new ModelData(2, R.string.name_2, R.drawable.milan_pic_1, R.string.milan_1, R.drawable.milan_pic_2, R.string.milan_2, R.drawable.milan_pic_3, R.string.milan_3, R.drawable.milan_pic_4, R.string.milan_4, R.drawable.milan_pic_5, R.string.milan_5, R.drawable.milan_pic_6, R.string.milan_6, R.drawable.milan_pic_7, R.string.milan_7));
        data.add(new ModelData(3, R.string.name_3, R.drawable.turin_pic_1, R.string.turin_1, R.drawable.turin_pic_2, R.string.turin_2, R.drawable.turin_pic_3, R.string.turin_3, R.drawable.turin_pic_4, R.string.turin_4, R.drawable.turin_pic_5, R.string.turin_5, R.drawable.turin_pic_6, R.string.turin_6, R.drawable.turin_pic_7, R.string.turin_7));
        data.add(new ModelData(4, R.string.name_4, R.drawable.naples_pic_1, R.string.naples_1, R.drawable.naples_pic_2, R.string.naples_2, R.drawable.naples_pic_3, R.string.naples_3, R.drawable.naples_pic_4, R.string.naples_4, R.drawable.naples_pic_5, R.string.naples_5, R.drawable.naples_pic_6, R.string.naples_6, R.drawable.naples_pic_7, R.string.naples_7));
        data.add(new ModelData(5, R.string.name_5, R.drawable.bologna_pic_1, R.string.bologna_1, R.drawable.bologna_pic_2, R.string.bologna_2, R.drawable.bologna_pic_3, R.string.bologna_3, R.drawable.bologna_pic_4, R.string.bologna_4, R.drawable.bologna_pic_5, R.string.bologna_5, R.drawable.bologna_pic_6, R.string.bologna_6, R.drawable.bologna_pic_7, R.string.bologna_7));
        data.add(new ModelData(6, R.string.name_6, R.drawable.florence_pic_1, R.string.florence_1, R.drawable.florence_pic_2, R.string.florence_2, R.drawable.florence_pic_3, R.string.florence_3, R.drawable.florence_pic_4, R.string.florence_4, R.drawable.florence_pic_5, R.string.florence_5, R.drawable.florence_pic_6, R.string.florence_6, R.drawable.florence_pic_7, R.string.florence_7));
        data.add(new ModelData(7, R.string.name_7, R.drawable.vatican_pic_1, R.string.vatican_1, R.drawable.vatican_pic_2, R.string.vatican_2, R.drawable.vatican_pic_3, R.string.vatican_3, R.drawable.vatican_pic_4, R.string.vatican_4, R.drawable.vatican_pic_5, R.string.vatican_5, R.drawable.vatican_pic_6, R.string.vatican_6, R.drawable.vatican_pic_7, R.string.vatican_7));
        data.add(new ModelData(8, R.string.name_8, R.drawable.pisa_pic_1, R.string.pisa_1, R.drawable.pisa_pic_2, R.string.pisa_2, R.drawable.pisa_pic_3, R.string.pisa_3, R.drawable.pisa_pic_4, R.string.pisa_4, R.drawable.pisa_pic_5, R.string.pisa_5, R.drawable.pisa_pic_6, R.string.pisa_6, R.drawable.pisa_pic_7, R.string.pisa_7));
        data.add(new ModelData(9, R.string.name_9, R.drawable.venice_pic_1, R.string.venice_1, R.drawable.venice_pic_2, R.string.venice_2, R.drawable.venice_pic_3, R.string.venice_3, R.drawable.venice_pic_4, R.string.venice_4, R.drawable.venice_pic_5, R.string.venice_5, R.drawable.venice_pic_6, R.string.venice_6, R.drawable.venice_pic_7, R.string.venice_7));
        data.add(new ModelData(10, R.string.name_10, R.drawable.sicily_pic_1, R.string.sicily_1, R.drawable.sicily_pic_2, R.string.sicily_2, R.drawable.sicily_pic_3, R.string.sicily_3, R.drawable.sicily_pic_4, R.string.sicily_4, R.drawable.sicily_pic_5, R.string.sicily_5, R.drawable.sicily_pic_6, R.string.sicily_6, R.drawable.sicily_pic_7, R.string.sicily_7));
        data.add(new ModelData(11, R.string.name_11, R.drawable.genoa_pic_1, R.string.genoa_1, R.drawable.genoa_pic_2, R.string.genoa_2, R.drawable.genoa_pic_3, R.string.genoa_3, R.drawable.genoa_pic_4, R.string.genoa_4, R.drawable.genoa_pic_5, R.string.genoa_5, R.drawable.genoa_pic_6, R.string.genoa_6, R.drawable.genoa_pic_7, R.string.genoa_7));
        data.add(new ModelData(12, R.string.name_12, R.drawable.about_app_pic_1, R.string.about_app_1, R.drawable.about_app_pic_2, R.string.about_app_2, R.drawable.about_app_pic_3, R.string.about_app_3, R.drawable.about_app_pic_4, R.string.about_app_4, R.drawable.about_app_pic_5, R.string.about_app_5, R.drawable.about_app_pic_6, R.string.about_app_6, R.drawable.about_app_pic_7, R.string.about_app_7));
    }

    public ModelData getDataByPosition(int position) {
        return data.get(position);
    }

}
