public class createCSV {
    private static final String SAMPLE_CSV_FILE = "exchange.csv";
    public void createFile(){
        try(
                BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE), StandardOpenOption.CREATE_NEW);
                CSVPrinter csvPrinter = new CSVPrinter(bufferedWriter, CSVFormat.DEFAULT
                        .withHeader("id", "first_name", "last_name", "email", "phone_number", "hire_date", "job_id", "salary", "department_id"))
        ){

        }catch (Exception e){

        }
    }
}
