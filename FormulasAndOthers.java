public class FormulasAndOthers {
    public static void main(String[] args) {
     /*
        ------------------------------------------------------------------------------------------------------
                                          ФОРМУЛИ:
         ЗА РАЗТОЯНИЕ МЕЖДУ ДВЕ ТОЧКИ В КООРДИНАТНА СИСТЕМА
         Line= Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

         ЗА РАЗТОЯНИЕ ОТ ЦЕНТЪРА ДО ТОЧКА - Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2)
        -------------------------------------------------------------------------------------------------------
         -boolean- добавя в мап кей със стойност ако не съществува ,а ако съществува увеличава стойноста:
         userInfo.put(user,!userInfo.containsKey(user)?points:userInfo.get(user)+points);

         изтрива от листа брой позиции ако са валидни индексите:
         if (endIndex >= startIndex) {
                        numbers.subList(startIndex, endIndex + 1).clear();
                   }

         - броя на уникалните символи в текст :
         text.chars().distinct().count()

         - сумира интиджерите в матрица :
         Arrays.stream(matrix).flatMapToInt(IntStream::of).sum();
         Arrays.stream(matrix).mapToInt(arr->Arrays.stream(arr).sum()).sum());
        -------------------------------------------------------------------------------------------------------*/
    }
}
