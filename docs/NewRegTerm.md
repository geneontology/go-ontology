## Creating Regulation Terms

- See Daily Workflow for creating branches and basic Protégé instructions. 

To create a parent regulation term, if it doesn’t exist:


1. To create a new regulation term, the 'Asserted view' must be active (not the 'Inferred view'). 

2. In the Protege classes view navigate to ‘biological regulation’
   
3. Click on the add subclass button at the top left corner.
   
4. In the pop-up window add the name of the new regulation term ‘regulation of target process’. The identifier should auto-populate. Click the button to add the term.
   
5. Enter the appropriate information for namespace, definition, synonyms etc in the obo editing view as decribed in the 'Creating a New Ontology Term' Section.
   
6. Create a logical definition for the term: 
   
       ```biological_process``` __and__ ```regulates``` __some__ ```‘target process’```
   
7. Remove the asserted ‘biological regulation’ parent.
   
8. Run the reasoner to be sure that reasoning results in the correct inferred parents.


- See 'Daily workflow' section for commit, push and merge instructions. 

