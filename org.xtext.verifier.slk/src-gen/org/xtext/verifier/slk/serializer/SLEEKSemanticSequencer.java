package org.xtext.verifier.slk.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.verifier.slk.sLEEK.Argument;
import org.xtext.verifier.slk.sLEEK.Data;
import org.xtext.verifier.slk.sLEEK.Lemma;
import org.xtext.verifier.slk.sLEEK.Precodition;
import org.xtext.verifier.slk.sLEEK.Print;
import org.xtext.verifier.slk.sLEEK.SLEEK;
import org.xtext.verifier.slk.sLEEK.SLEEKPackage;
import org.xtext.verifier.slk.services.SLEEKGrammarAccess;

@SuppressWarnings("all")
public class SLEEKSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SLEEKGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SLEEKPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SLEEKPackage.ARGUMENT:
				if(context == grammarAccess.getArguRule() ||
				   context == grammarAccess.getArgumentRule()) {
					sequence_Argument(context, (Argument) semanticObject); 
					return; 
				}
				else break;
			case SLEEKPackage.DATA:
				if(context == grammarAccess.getArguRule() ||
				   context == grammarAccess.getDataRule()) {
					sequence_Data(context, (Data) semanticObject); 
					return; 
				}
				else break;
			case SLEEKPackage.LEMMA:
				if(context == grammarAccess.getArguRule() ||
				   context == grammarAccess.getLemmaRule()) {
					sequence_Lemma(context, (Lemma) semanticObject); 
					return; 
				}
				else break;
			case SLEEKPackage.PRECODITION:
				if(context == grammarAccess.getArguRule() ||
				   context == grammarAccess.getPrecoditionRule()) {
					sequence_Precodition(context, (Precodition) semanticObject); 
					return; 
				}
				else break;
			case SLEEKPackage.PRINT:
				if(context == grammarAccess.getArguRule() ||
				   context == grammarAccess.getPrintRule()) {
					sequence_Print(context, (Print) semanticObject); 
					return; 
				}
				else break;
			case SLEEKPackage.SLEEK:
				if(context == grammarAccess.getSLEEKRule()) {
					sequence_SLEEK(context, (SLEEK) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=SLK
	 */
	protected void sequence_Argument(EObject context, Argument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SLEEKPackage.Literals.ARGU__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEEKPackage.Literals.ARGU__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArgumentAccess().getNameSLKTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=SLK
	 */
	protected void sequence_Data(EObject context, Data semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SLEEKPackage.Literals.ARGU__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEEKPackage.Literals.ARGU__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataAccess().getNameSLKTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=SLK
	 */
	protected void sequence_Lemma(EObject context, Lemma semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SLEEKPackage.Literals.ARGU__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEEKPackage.Literals.ARGU__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLemmaAccess().getNameSLKTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=SLK
	 */
	protected void sequence_Precodition(EObject context, Precodition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SLEEKPackage.Literals.ARGU__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEEKPackage.Literals.ARGU__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrecoditionAccess().getNameSLKTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=SLK
	 */
	protected void sequence_Print(EObject context, Print semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SLEEKPackage.Literals.ARGU__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEEKPackage.Literals.ARGU__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrintAccess().getNameSLKTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     keywords+=Argu*
	 */
	protected void sequence_SLEEK(EObject context, SLEEK semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
