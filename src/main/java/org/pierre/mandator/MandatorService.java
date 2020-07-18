package org.pierre.mandator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MandatorService {
    @Autowired
    MandatorRepository mandatorRepository;
    @Autowired
    RuleRepository ruleRepository;

    public void saveRule() {
        MandatorEntity mandatorEntity1 = new MandatorEntity("1", "pippo");
        mandatorRepository.save(mandatorEntity1);
        RuleImpl rule1 = new RuleImpl();
        rule1.setId("1");
        rule1.setMandatorEntity(mandatorEntity1);
        ruleRepository.save(rule1);

        List<RuleImpl> rules1 = ruleRepository.findAll();
        System.out.println(rules1);
    }

    public void saveAnotherRule() {
        MandatorEntity mandatorEntity2 = new MandatorEntity();
        mandatorEntity2.setMandatorId("1");
        RuleImpl rule2 = new RuleImpl();
        rule2.setId("2");
        rule2.setMandatorEntity(mandatorEntity2);
        ruleRepository.save(rule2);

        List<RuleImpl> rules2 = ruleRepository.findAll();
        System.out.println(rules2);
        List<MandatorEntity> mandators = mandatorRepository.findAll();
        System.out.println(mandators);
    }
}
