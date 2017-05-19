## Installing Protege

1. Follow the instructions on the GO wiki page: http://wiki.geneontology.org/index.php/Protege_setup_for_GO_Eds
2. Need to add more here about the different Views and Tabs needed for working.

## ID Ranges

1. Curators and projects are assigned specific GO term ID ranges.
2. These ID ranges are stored in the file:

    [go-idranges.owl](https://github.com/geneontology/go-ontology/blob/master/src/ontology/go-idranges.owl)

3. __ONLY USE IDs WITHIN YOUR RANGE!__
4. If you have only just set up this repository, modify the idranges file and add yourself or other editors. 

## Setting ID ranges in Protege

1. Once you have your assigned ID range, you need to configure Protege so that your ID range is recorded in the Preferences menu.  Protege does not read the go-idranges.owl file.
2. In the Protege menu, select Preferences.
3. In the resulting pop-up window, click on the New Entities tab and set the values as follows:
4. In the Entity IRI box:
    
    Start with:  
    ```Specified IRI:``` http://purl.obolibrary.org/obo

    Followed by:  
    ```/```

    End with:  
    ```Auto-generated ID```

5. In the Entity Label section:

    Same as label renderer:
    
    ```IRI``` http://www.w3.org/2000/01/rdf-schema#label

6.  In the Auto-generated ID section:

    Numeric

    Prefix GO_

    Suffix: ```leave this blank```

    Digit Count 7

    Start: see [go-idranges.owl](https://github.com/geneontology/go-ontology/blob/master/src/ontology/go-idranges.owl)  (Only paste in the number after the GO: prefix.  Also, note that when you paste in your GO ID range, the number will automatically be converted to a standard numeric, e.g. pasting in 0110001 will be converted to 110,001.)

    End: see [go-idranges.owl](https://github.com/geneontology/go-ontology/blob/master/src/ontology/go-idranges.owl)

    Remember last ID between Protege sessions: ALWAYS CHECK THIS

    (Note you want the ID to be remembered to prevent classes when working in parallel on branches.)
