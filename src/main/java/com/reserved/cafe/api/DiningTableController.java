package com.reserved.cafe.api;

import com.reserved.cafe.domain.Customer;
import com.reserved.cafe.domain.DiningTable;
import com.reserved.cafe.services.interfaces.DiningTableService;
import com.reserved.cafe.utilities.results.BaseResult;
import com.reserved.cafe.utilities.results.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diningTable")
public class DiningTableController {

    @Autowired
    private final DiningTableService diningTableService;

    public DiningTableController(DiningTableService diningTableService) {
        this.diningTableService = diningTableService;
    }
    @GetMapping("/getTableById")
    public DataResult<DiningTable> getAll(int tableId){
        return this.diningTableService.getDiningTableByTableId(tableId);
    }

    @PostMapping("/add")
    public BaseResult add(DiningTable diningTable){
        return this.diningTableService.add(diningTable);
    }

    @PutMapping("/updateStatus")
    public BaseResult updateStatus(int id, boolean status){
        return this.diningTableService.updateBusyStatus(id,status);
    }
}
