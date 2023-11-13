package br.edu.unifalmg.repository.impl;

import br.edu.unifalmg.domain.Chore;
import br.edu.unifalmg.repository.ChoreRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileChoreRepository implements ChoreRepository {

    private ObjectMapper mapper;

    public FileChoreRepository() {
        mapper = new ObjectMapper().findAndRegisterModules();
    }

    @Override
    public List<Chore> load() {
        try {
            // Arrays.asList → Gera uma lista IMUTAVEL
            return new ArrayList<>(
                    Arrays.asList(
<<<<<<< HEAD
                            mapper.readValue(new File("todo/src/main/resources/chores.json"), Chore[].class)
=======
                            mapper.readValue(new File("chores.json"), Chore[].class)
>>>>>>> 8a145508ae9bb84231ccde42183ffa2aff2410b9
                    )
            );

            // Using TypeReference
//            return mapper.readValue(new File("chores.json"),
//                    new TypeReference<>() {
//                    });
        } catch(MismatchedInputException exception) {
            System.out.println("Unable to convert the content of the file into Chores!");
        } catch(IOException exception) {
            System.out.println("ERROR: Unable to open file.");
        }
        return new ArrayList<>();
    }

    @Override
<<<<<<< HEAD
    public boolean save(List<Chore> chores) {
        try {
            mapper.writeValue(new File("todo/src/main/resources/chores.json"), chores);
=======
    public boolean saveAll(List<Chore> chores) {
        try {
            mapper.writeValue(new File("chores.json"), chores);
>>>>>>> 8a145508ae9bb84231ccde42183ffa2aff2410b9
            return true;
        } catch (IOException exception) {
            System.out.println("ERROR: Unable to write the chores on the file.");
        }
        return false;
    }

<<<<<<< HEAD
=======
    @Override
    public boolean save(Chore chore) {
        throw new RuntimeException("Operation not supported yet.");
    }

>>>>>>> 8a145508ae9bb84231ccde42183ffa2aff2410b9
}
