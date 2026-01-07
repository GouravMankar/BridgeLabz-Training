package com.edumentor;
public class Learner extends User implements ICertifiable {
    public Learner(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Certificate generated for learner " + name);
    }
}
