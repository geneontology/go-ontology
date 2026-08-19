# Design Patterns

| Pattern | Description |
|:--------|:------------|
| [anatomical structure development](anatomical_structure_development.md) | This pattern is for classes representing developmental processes, differentiated by the anatomical structure or cell being developed. |
| [anatomical structure formation](anatomical_structure_formation.md) | This pattern is for classes representing formation of anatomical structures from their initial state, differentiated by the anatomical structure being formed. Not used for cells. |
| [anatomical structure maturation](anatomical_structure_maturation.md) | This pattern is for classes representing the maturation of an anatomical structure or a cell, differentiated by the anatomical structure or cell being in its final state. |
| [anatomical structure morphogenesis](anatomical_structure_morphogenesis.md) | This pattern is for classes representing the generation and organization of the shape of an anatomical structure or a cell, differentiated by the anatomical structure or cell being generated. |
| [anatomical structure organization](anatomical_structure_organization.md) | TODO |
| [antiporter activity](antiporter_activity.md) | This pattern is for classes representing antiporter activities, differentiated by the type of inputs. |
| [binding](binding.md) | TODO |
| [biosynthetic process](biosynthetic_process.md) | This pattern is for classes representing biosynthetic processes differentiated by their primary outputs. |
| [bounding membrane of organelle](bounding_membrane_of_organelle.md) | TODO |
| [catabolic process](catabolic_process.md) | This pattern is for classes representing catabolic processes differentiated by their primary inputs. |
| [cc assembly](cc_assembly.md) | TODO |
| [cc disassembly](cc_disassembly.md) | TODO |
| [cc transport from to](cc_transport_from_to.md) | TODO |
| [cell differentiation by mature cell type](cell_differentiation_by_mature_cell_type.md) | This pattern is for classes representing cell differentiation, differentiated by the resulting mature cell type. |
| [cell fate commitment](cell_fate_commitment.md) | This pattern is for classes representing the commitment of cells to a specific cell type, differentiated by the type of cell. |
| [cell fate determination](cell_fate_determination.md) | This pattern is for classes representing the determination of cell fate, differentiated by the cell being differentiated. |
| [cell specification](cell_specification.md) | This pattern is for classes representing the specification of cells, differentiated by the cell being specified. |
| [cellular anatomical entity organization](cellular_anatomical_entity_organization.md) | TODO |
| [cell–cell signaling by start and end cell types](cell_cell_signaling_by_start_end.md) | This pattern is for classes representing cell–cell signaling, differentiated by the start and end cell types. |
| [chemical transport](chemical_transport.md) | TODO |
| [chromosomal region](chromosomal_region.md) | TODO |
| [establishment of protein localization to](establishment_of_protein_localization_to.md) | TODO |
| [export across membrane](export_across_membrane.md) | TODO |
| [import across membrane](import_across_membrane.md) | TODO |
| [import across plasma membrane](import_across_plasma_membrane.md) | TODO |
| [import into cell](import_into_cell.md) | TODO |
| [intermembrane lipid transfer activity](intermembrane_lipid_transfer_activity.md) | Lipid transfer activities differentiated by the specific lipid cargo. A refinement of the generic molecular_carrier_activity pattern where the cargo is a lipid and delivery involves extraction from one membrane or monolayer lipid particle, transit through the aqueous phase in a hydrophobic pocket, and deposition into an acceptor membrane or lipid particle. Inherits both is_a lipid carrier activity (GO:0005319) and is_a transporter activity (GO:0005215) via the parent GO:0120013. Do NOT use this pattern for cross-leaflet (intramembrane) lipid movement - use intramembrane_lipid_carrier_activity.yaml for that.
 |
| [intramembrane lipid carrier activity](intramembrane_lipid_carrier_activity.md) | Cargo-differentiated intramembrane lipid carriers directly under GO:0140303 intramembrane lipid carrier activity, i.e. terms whose genus is GO:0140303 and which are not further specialised by translocation direction / energy source.
For direction-specific children, use one of the sibling patterns:
  - lipid_flippase_activity.yaml (genus GO:0140327 flippase activity;
    exoplasmic to cytosolic, ATP-driven)
  - lipid_floppase_activity.yaml (genus GO:0140328 floppase activity;
    cytosolic to exoplasmic, ATP-driven)

There is currently no cargo-differentiated pattern under GO:0017128 phospholipid scramblase activity (bidirectional, ATP-independent), since GO:0017128 has no logical-definition children in the ontology.
Do NOT use this pattern for intermembrane lipid transfer (use intermembrane_lipid_transfer_activity.yaml) or for generic lipid delivery to an acceptor molecule (use molecular_carrier_activity.yaml).
 |
| [involved in x y](involved_in_x_y.md) | TODO |
| [lipid flippase activity](lipid_flippase_activity.md) | Cargo-differentiated flippase activities under GO:0140327 flippase activity (catalysis of the movement of lipids from the exoplasmic to the cytosolic leaflet of a membrane, using energy from the hydrolysis of ATP).
Related patterns for the sibling families:
  - lipid_floppase_activity.yaml (genus GO:0140328; cytosolic to
    exoplasmic, ATP-driven)
  - intramembrane_lipid_carrier_activity.yaml (genus GO:0140303;
    cargo-differentiated terms not further specialised by direction)

ATP hydrolysis: GO:0140326 ATPase-coupled intramembrane lipid carrier activity (the parent of GO:0140327 and GO:0140328) asserts 'relationship: has_part GO:0016887 ATP hydrolysis activity' once; that axiom is inherited by every flippase / floppase child and should not be re-asserted on individual instances.
 |
| [lipid floppase activity](lipid_floppase_activity.md) | Cargo-differentiated floppase activities under GO:0140328 floppase activity (catalysis of the movement of a lipid from the cytosolic to the exoplasmic leaflet of a membrane, using energy from the hydrolysis of ATP).
Related patterns for the sibling families:
  - lipid_flippase_activity.yaml (genus GO:0140327; exoplasmic to
    cytosolic, ATP-driven)
  - intramembrane_lipid_carrier_activity.yaml (genus GO:0140303;
    cargo-differentiated terms not further specialised by direction)

ATP hydrolysis: GO:0140326 ATPase-coupled intramembrane lipid carrier activity (the parent of GO:0140327 and GO:0140328) asserts 'relationship: has_part GO:0016887 ATP hydrolysis activity' once; that axiom is inherited by every flippase / floppase child and should not be re-asserted on individual instances.
 |
| [membrane region](membrane_region.md) | TODO |
| [metabolic process](metabolic_process.md) | This pattern is for classes representing metabolic processes differentiated by their primary inputs or primary outputs. |
| [molecular carrier activity](molecular_carrier_activity.md) | Molecular carrier activities differentiated by cargo. A carrier binds a specific chemical entity or protein and moves with it to an acceptor molecule or a specific location.
Label conventions (editorial, not encoded in the axiom):
  - Default label form: '%s carrier activity' (e.g. lipid carrier activity,
    oxygen carrier activity, lipoprotein carrier activity).
  - For carriers whose acceptor is a protein (metal chaperones, histone
    chaperones, etc), curators use '%s chaperone activity' instead
    (e.g. metallochaperone activity, copper chaperone activity,
    iron chaperone activity, iron-sulfur cluster chaperone activity,
    zinc chaperone activity, nickel chaperone activity).
  - Exception: GO:0140597 keeps the label 'protein carrier activity'
    rather than 'protein chaperone activity' to avoid a collision with
    GO:0044183 protein folding chaperone, which is a different
    sense of "chaperone" (folding assistance rather than cargo delivery).

The carrier/chaperone distinction is editorial only - the equivalence axiom is the same for both. Chaperone and non-chaperone terms are both listed in the companion TSV.
When the cargo cannot be pinned to a single class (heterogeneous cargo) but the transport process is defined, use molecular_carrier_activity_by_process.yaml instead.
 |
| [molecular carrier activity by transport process](molecular_carrier_activity_by_process.md) | Molecular carrier activities differentiated by the transport process they are part of, rather than by cargo. Use this pattern only when the cargo cannot be pinned to a single well-defined class (for example, a carrier that moves either proteins or RNAs), but the transport biological process is defined. When the cargo IS a single well-defined class, use molecular_carrier_activity.yaml instead. Prototype: GO:0140142 nucleocytoplasmic carrier activity (part_of GO:0006913 nucleocytoplasmic transport).
Note on the label template: '%s carrier activity' is a naming convention rather than a mechanical substitution. Filling the sole current instance mechanically gives 'nucleocytoplasmic transport carrier activity', where the curated label is 'nucleocytoplasmic carrier activity' - the trailing 'transport' from the process label is dropped. This is analogous to chemical_transport.yaml (where CHEBI labels are similarly not always substituted verbatim into the term name).
 |
| [molecular function activator activity](activator_activity.md) | This pattern is for representing a function that activates some molecular function, differentiated by the specific molecular function activated. |
| [molecular function inhibitor activity](inhibitor_activity.md) | This pattern is for representing a function that inhibits some molecular function, differentiated by the specific molecular function inhibited. |
| [molecular function regulator activity](regulator_activity.md) | This pattern is for representing a function that modulates some molecular function, differentiated by the specific molecular function modulated. |
| [multi-organism process](multi_organism_process.md) | TODO |
| [negative regulation](negative_regulation.md) | This pattern is for classes representing types of negative regulation differentiated by the process they regulate. |
| [negative regulation of characteristic](negative_regulation_of_characteristic.md) | Negative regulation of a particular characteristic. |
| [occurs in](occursIn.md) | TODO |
| [part of cell component](part_of_cell_component.md) | TODO |
| [positive regulation](positive_regulation.md) | This pattern is for classes representing types of positive regulation differentiated by the process they regulate. |
| [positive regulation of characteristic](positive_regulation_of_characteristic.md) | Positive regulation of a particular characteristic. |
| [protein complex by activity](protein_complex_by_activity.md) | TODO |
| [protein localization to](protein_localization_to.md) | TODO |
| [regulation](regulation.md) | This pattern is for classes representing types of regulation differentiated by the process they regulate. One of three core patterns for regulation terms in the GO. Do not use this pattern for the 3 grouping classes: regulation of MF, regulation of BP, regulation of BQ |
| [regulation by](regulation_by.md) | This pattern is for classes representing types of regulation differentiated by the process they regulate and the mechanism of regulation. |
| [regulation of characteristic](regulation_of_characteristic.md) | Regulation of a particular characteristic. |
| [response to stimulus by stimulus type](response_to_stimulus_by_stimulus.md) | This pattern is for classes representing response to stimulus, differentiated by the type of stimulus. |
| [signaling receptor activity by input](signaling_receptor_activity_by_input.md) | This pattern is for classes representing signaling receptor activity, differentiated by the type of input. |
| [single-organism process](single_organism_process.md) | TODO |
| [symporter activity](symporter_activity.md) | This pattern is for classes representing symporter activities, differentiated by the type of inputs. |
| [transmembrane import into cytosol](transmembrane_import_into_cytosol.md) | TODO |
| [transmembrane transport](transmembrane_transport.md) | This pattern is for representing transmembrane transport, differentiated by the type of cargo. |
| [transport of a cellular component](cc_transport.md) | Transport of a cellular component, differentiated by the component being transported. |
| [vesicle-mediated transport differentiated by cargo](vesicle_mediated_transport_differentiated_by_cargo.md) | This pattern is for representing vesicle-mediated transport, differentiated by the type of cargo. |
| [vesicle-mediated transport differentiated by cargo and start and end locations](vesicle_mediated_transport_differentiated_by_cargo_and_start_and_end_locations.md) | This pattern is for representing transmembrane transport, differentiated by the type of cargo as well as the start and end locations. |
| [vesicle-mediated transport differentiated by start and end locations](vesicle_mediated_transport_differentiated_by_start_and_end_locations.md) | This pattern is for representing vesicle-mediated transport, differentiated by the start and end locations. |
