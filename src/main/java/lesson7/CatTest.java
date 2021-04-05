package lesson7;
/*
 *	Журавлев Дмитрий
 *	Д/З № 7
 */

public  class CatTest {

    public static void main(String[] args) {
        // Создаём массив котов
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Том", false, 10);
        cat[1] = new Cat("Барсик", false, 30);
        cat[2] = new Cat("Рыжий", false, 50);
        // Кладём в миску еды
        Plate plate = new Plate(60);

        // Пока есть коты
        for (Cat i : cat) {
            // И если в миске не хватает еды, добавляем
            if (!plate.checkMeal(i.getAppetite())) {
                System.out.println(" В миске не хватает еды, чтобы покормить кота!" + " Добавим еды, чтобы " + i.getName() + " не остался голодным!");
                plate.addMeal();
            }
            // Коты едят
            i.Eat(plate);
            System.out.println(" " + i.getName() + " - съел " + i.getAppetite() + " единиц еды!" + " Сытость - " + i.getSatiety());
            System.out.println(" В миске осталось " + plate.getMeal() + " единиц еды!");
        }
    }
}


