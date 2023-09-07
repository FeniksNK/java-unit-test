@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
        }

@Test
public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(15);
        assertEquals("Для возраста меньше 18 checkIsAdult должен вернуть false", false, isAdult);
        }

@Test
public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        assertEquals("Для возраста 18 лет checkIsAdult должен вернуть true", true, isAdult);
        }