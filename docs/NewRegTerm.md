## Creating Regulation Terms

To create a parent regulation term, if it doesn’t exist:

   1. In the Protege classes view navigate to ‘biological regulation’
   
   2. Click on the add subclass button at the top left corner.
   
   3. In the pop-up window add the name of the new regulation term ‘regulation of target process’. The identifier should auto-populate. Click the button to add the term.
   
   4. Enter the appropriate information for namespace, definition, synonyms etc in the obo editing view.
   
   5. Create a logical definition for the term: 
   
       ```biological_process``` __and__ ```regulates``` __some__ ```‘target process’```
   
   6. Remove the asserted ‘biological regulation’ parent.
   
   7. Run the reasoner to be sure that reasoning results in the correct inferred parents.
