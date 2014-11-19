-- studies
insert into study(pubmed_id) values('18464913');

-- snps
insert into snp(rs_id) values('rs4796217');
insert into snp(rs_id) values('rs5751901');
insert into snp(rs_id) values('rs9303029');
insert into snp(rs_id) values('rs8109578');
insert into snp(rs_id) values('rs10874639');

-- trait associations
insert into trait_association(trait, study_id, snp_id) values('http://www.ebi.ac.uk/efo/EFO_0004623', 1, 1);
insert into trait_association(trait, study_id, snp_id) values('http://www.ebi.ac.uk/efo/EFO_0004623', 1, 2);
insert into trait_association(trait, study_id, snp_id) values('http://www.ebi.ac.uk/efo/EFO_0004623', 1, 3);
insert into trait_association(trait, study_id, snp_id) values('http://www.ebi.ac.uk/efo/EFO_0004623', 1, 4);
insert into trait_association(trait, study_id, snp_id) values('http://www.ebi.ac.uk/efo/EFO_0004623', 1, 5);
