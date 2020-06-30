package com.alsa.container.javaBasedContainerConfiguration.composingConfigurations.usingInportAnnotation;

import com.alsa.container.javaBasedContainerConfiguration.composingConfigurations.usingInportAnnotation.AccountRepository;
import com.alsa.container.javaBasedContainerConfiguration.composingConfigurations.usingInportAnnotation.TransferService;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/10
 * @Time: 10:09
 * @Description:
 */
public class TransferServiceImpl implements TransferService {
    private AccountRepository accountRepository;

    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run() {
        accountRepository.execute();
    }
}
