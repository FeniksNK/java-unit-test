@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        boolean expected = (19 > 18);


        assertEquals("Пользователю меньше 18 лет", expected, isAdult);
        }