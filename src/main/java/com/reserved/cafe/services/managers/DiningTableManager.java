package com.reserved.cafe.services.managers;

import com.reserved.cafe.domain.DiningTable;
import com.reserved.cafe.repositories.DiningTableRepository;
import com.reserved.cafe.services.interfaces.DiningTableService;
import com.reserved.cafe.utilities.results.BaseResult;
import com.reserved.cafe.utilities.results.DataResult;
import com.reserved.cafe.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiningTableManager implements DiningTableService {

    @Autowired
    private DiningTableRepository diningTableRepository;

    public DiningTableManager(DiningTableRepository diningTableRepository) {
        this.diningTableRepository = diningTableRepository;
    }

    @Override
    public DataResult<DiningTable> getDiningTableByTableId(int tableId) {
        return new DataResult<DiningTable>(diningTableRepository.getDiningTableById(tableId),true);
    }

    @Override
    public BaseResult add(DiningTable diningTable) {
        this.diningTableRepository.save(diningTable);
        return new SuccessResult("Masa Eklendi");
    }

    @Override
    public BaseResult updateBusyStatus(int id, boolean status) {
        DiningTable d = this.diningTableRepository.getDiningTableById(id);
        d.setBusy(status);
        this.diningTableRepository.save(d);
        return new SuccessResult("Status " + status + " olarak güncellendi");
    }
}
