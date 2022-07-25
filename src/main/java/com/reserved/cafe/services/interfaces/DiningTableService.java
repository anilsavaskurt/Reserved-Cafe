package com.reserved.cafe.services.interfaces;

import com.reserved.cafe.domain.Customer;
import com.reserved.cafe.domain.DiningTable;
import com.reserved.cafe.utilities.results.BaseResult;
import com.reserved.cafe.utilities.results.DataResult;

public interface DiningTableService {

    DataResult<DiningTable> getDiningTableByTableId(int tableId);

    BaseResult add(DiningTable diningTable);

    BaseResult updateBusyStatus(int id, boolean status);
}
