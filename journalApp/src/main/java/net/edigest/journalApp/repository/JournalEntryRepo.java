package net.edigest.journalApp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import net.edigest.journalApp.entity.JournalEntry;

@Component
public interface JournalEntryRepo extends MongoRepository<JournalEntry, ObjectId> {

}
