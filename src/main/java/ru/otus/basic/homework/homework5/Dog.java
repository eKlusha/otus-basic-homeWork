package ru.otus.basic.homework.homework5;

class Dog extends Animal {

    Dog(String name, float runningSpeed, float swimmingSpeed, int stamina, int runningFatigue, int swimmingFatigue, float actualDistance, float runTime) {
        super(name, runningSpeed,swimmingSpeed, stamina,runningFatigue,swimmingFatigue, actualDistance, runTime);
    }

    @Override
    float run(int distance) {
        float distanceHelper = 0.0f;
        float runTime = 0.0f;
        if (stamina > 0) {
            for (int i = 1; i != distance + 1; i++) {
                if (stamina > 0) {
                    stamina--;
                    runTime += (1 / runningSpeed);
                    distanceHelper = i;
                }
            }
            actualDistance += distanceHelper;
            actualTime += runTime;
            System.out.println(name + " пробежал " + distanceHelper + "метров за " + runTime + " секунд и у него осталось " + stamina + " единиц выносливости");
        } else {
            runTime = -1.0f;
            System.out.println(name + " устал и больше ни куда не побежит. Но огонь в его глазах не потух)");
        }
        return runTime;
    }
    @Override
    float swim(int distance) {
        float distanceHelper = 0.0f;
        float swimTime = 0.0f;
        if (stamina > 0) {
            for (int i = 1; i != distance + 1; i++) {
                if (stamina > 0) {
                    stamina -= 2;
                    swimTime += (1 / swimmingSpeed);
                    distanceHelper = i;
                }
            }
            actualDistance += distanceHelper;
            actualTime += swimTime;
            System.out.println(name + " проплыл " + distanceHelper + "метров за " + swimTime + " секунд и у него осталось " + stamina + " единиц выносливости");
        } else {
            actualTime = -1.0f;
            System.out.println(name + " устал и больше ни куда не поплывёт");
        }
        return actualTime;
    }
}