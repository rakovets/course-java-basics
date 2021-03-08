package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.view;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.repository.CashiersRepository;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.service.CustomerThreadService;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.model.Product;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.service.StoreService;
import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

public class StoreViewConsole implements StoreView {
    private final CashiersRepository cashiersRepository = new CashiersRepository();

    public void cashiersServed(CustomerThreadService customerThreadService) {
        StoreService storeService = new StoreService();
        StandardOutputUtil.println(cashiersRepository.get(storeService.cashier) + " served " +
                customerThreadService.getCustomer(), AnsiColorCode.FG_RED_BOLD);
        for (Product product : customerThreadService.getShoppingList()) {
            StandardOutputUtil.println(cashiersRepository.get(storeService.cashier) + " checked out " +
                    product, AnsiColorCode.FG_BLACK_BOLD_BRIGHT);
        }
    }
}